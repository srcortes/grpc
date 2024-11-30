package sec06;

import com.grpc.models.sec06.AccountBalance;
import com.grpc.models.sec06.BalanceCheckRequest;
import com.grpc.models.sec06.BankServiceGrpc;
import io.grpc.stub.StreamObserver;
import sec06.repository.AccountRepository;

public class BankService extends BankServiceGrpc.BankServiceImplBase {

    @Override
    public void getAccountBalance(BalanceCheckRequest request, StreamObserver<AccountBalance> responseObserver) {
        System.out.println("aqwui");
        int accountNumber = request.getAccountNumber();

        AccountBalance accountBalance = AccountBalance.newBuilder()
                .setAccountNumber(accountNumber)
                .setBalance(AccountRepository.getBalance(accountNumber)).build();
        responseObserver.onNext(accountBalance);
        responseObserver.onCompleted();
    }
}
