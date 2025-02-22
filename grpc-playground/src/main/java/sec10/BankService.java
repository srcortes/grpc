package sec10;

import com.google.common.util.concurrent.Uninterruptibles;
import com.grpc.models.sec10.BankServiceGrpc;
import com.grpc.models.sec10.BalanceCheckRequest;
import com.grpc.models.sec10.Money;
import com.grpc.models.sec10.WithDrawRequest;
import com.grpc.models.sec10.AccountBalance;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sec10.repository.AccountRepository;
import sec10.validator.RequestValidator;

import java.util.concurrent.TimeUnit;

public class BankService extends BankServiceGrpc.BankServiceImplBase {

    private static final Logger log = LoggerFactory.getLogger(BankService.class);

    @Override
    public void getAccountBalance(com.grpc.models.sec10.BalanceCheckRequest request, StreamObserver<AccountBalance> responseObserver) {
        RequestValidator.validateAccount(request.getAccountNumber())
                .map(Status::asRuntimeException)
                .ifPresentOrElse(responseObserver::onError,
                        () -> sendAccountBalance(request, responseObserver));
    }

    @Override
    public void withDraw(WithDrawRequest request, StreamObserver<Money> responseObserver) {
        RequestValidator.validateAccount(request.getAccountNumber())
                .or(()-> RequestValidator.isAmountDivisibleBy10(request.getAmount()))
                .or(()-> RequestValidator
                        .hasSufficientBalance(request.getAmount(),
                                AccountRepository.getBalance(request.getAccountNumber())))
                .map(Status::asRuntimeException)
                .ifPresentOrElse(responseObserver::onError,
                        ()-> sendMoney(request, responseObserver));

    }

    private void sendAccountBalance(BalanceCheckRequest request, StreamObserver<AccountBalance> responseObserver) {
        int accountNumber = request.getAccountNumber();

        AccountBalance accountBalance = AccountBalance.newBuilder()
                .setAccountNumber(accountNumber)
                .setBalance(AccountRepository.getBalance(accountNumber)).build();
        responseObserver.onNext(accountBalance);
        responseObserver.onCompleted();
    }

    private void sendMoney(WithDrawRequest request, StreamObserver<Money> responseObserver) {
        try{
            var accountNumber = request.getAccountNumber();
            var requestAmount = request.getAmount();
            var accountBalance = AccountRepository.getBalance(accountNumber);

            if(requestAmount > accountBalance){
                responseObserver.onCompleted();
                return;
            }

            for(int j = 0; j < (requestAmount / 10); j++){
                var money = Money.newBuilder()
                        .setAmount(10).build();
                if(j == 3)
                    throw new RuntimeException();

                responseObserver.onNext(money);
                AccountRepository.deductAmount(accountNumber, 10);
                Uninterruptibles.sleepUninterruptibly(1, TimeUnit.SECONDS);
            }
            responseObserver.onCompleted();

        }catch(Exception ex){
            responseObserver.onError(Status.INTERNAL.withDescription(ex.getMessage()).asRuntimeException());
        }

    }


}
