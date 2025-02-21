package sec09;

import com.google.common.util.concurrent.Uninterruptibles;
import com.grpc.models.sec09.AccountBalance;
import com.grpc.models.sec09.BalanceCheckRequest;
import com.grpc.models.sec09.BankServiceGrpc;
import com.grpc.models.sec09.WithDrawRequest;

import io.grpc.stub.StreamObserver;
import io.grpc.Status;
import sec06.repository.AccountRepository;
import sec09.validator.RequestValidator;

import java.util.concurrent.TimeUnit;

public class BankService extends BankServiceGrpc.BankServiceImplBase {

    @Override
    public void getAccountBalance(BalanceCheckRequest request, StreamObserver<AccountBalance> responseObserver) {
        RequestValidator.validateAccount(request.getAccountNumber())
                .map(Status::asRuntimeException)
                .ifPresentOrElse(status -> responseObserver.onError(status.asRuntimeException()),
                        () -> sendAccountBalance(request, responseObserver));
    }

    @Override
    public void withDraw(WithDrawRequest request, StreamObserver<com.grpc.models.sec09.Money> responseObserver) {
        var accountNumber = request.getAccountNumber();
        var requestAmount = request.getAmount();
        var accountBalance = AccountRepository.getBalance(accountNumber);

        if(requestAmount > accountBalance){
            responseObserver.onCompleted();
        }

        for(int j = 0; j < (requestAmount / 10); j++){
            var money = Money.newBuilder()
                    .setAmount(10).build();
            responseObserver.onNext(money);
            AccountRepository.deductAmount(accountNumber, 10);
            Uninterruptibles.sleepUninterruptibly(1, TimeUnit.SECONDS);
        }
        responseObserver.onCompleted();
    }

    private void sendAccountBalance(BalanceCheckRequest request, StreamObserver<AccountBalance> responseObserver) {
        int accountNumber = request.getAccountNumber();

        AccountBalance accountBalance = AccountBalance.newBuilder()
                .setAccountNumber(accountNumber)
                .setBalance(AccountRepository.getBalance(accountNumber)).build();
        responseObserver.onNext(accountBalance);
        responseObserver.onCompleted();
    }
}
