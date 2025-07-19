package sec11;


import com.google.common.util.concurrent.Uninterruptibles;
import com.grpc.models.sec11.AccountBalance;
import com.grpc.models.sec11.BalanceCheckRequest;
import com.grpc.models.sec11.BankServiceGrpc;
import io.grpc.Context;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sec10.BankService;
import sec11.repository.AccountRepository;

import java.util.concurrent.TimeUnit;

public class DeadLineBankService extends BankServiceGrpc.BankServiceImplBase {

    private static final Logger log = LoggerFactory.getLogger(DeadLineBankService.class);

    @Override
    public void getAccountBalance(BalanceCheckRequest request, StreamObserver<AccountBalance> responseObserver) {
        int accountNumber = request.getAccountNumber();

        AccountBalance accountBalance = AccountBalance.newBuilder()
                .setAccountNumber(accountNumber)
                .setBalance(AccountRepository.getBalance(accountNumber)).build();
        Uninterruptibles.sleepUninterruptibly(60, TimeUnit.SECONDS);
        responseObserver.onNext(accountBalance);
        responseObserver.onCompleted();
    }


    @Override
    public void withDraw(com.grpc.models.sec11.WithDrawRequest request, StreamObserver<com.grpc.models.sec11.Money> responseObserver) {
        var accountNumber = request.getAccountNumber();
        var requestAmount = request.getAmount();
        var accountBalance = AccountRepository.getBalance(accountNumber);

        if(requestAmount > accountBalance){
            responseObserver.onError(Status.FAILED_PRECONDITION.asRuntimeException());
            return;
        }


        for(int j = 0; j < (requestAmount / 10) && !Context.current().isCancelled(); j++){
            var money = com.grpc.models.sec11.Money.newBuilder()
                    .setAmount(10).build();
            responseObserver.onNext(money);
            AccountRepository.deductAmount(accountNumber, 10);
            Uninterruptibles.sleepUninterruptibly(160, TimeUnit.SECONDS);
        }
        log.info("Streaming completed");
        responseObserver.onCompleted();

    }
}
