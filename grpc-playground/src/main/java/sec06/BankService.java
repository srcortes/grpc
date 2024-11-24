package sec06;

import com.grpc.models.sec06.AccountBalance;
import com.grpc.models.sec06.BalanceCheckRequest;
import com.grpc.models.sec06.BankServiceGrpc;
import io.grpc.stub.StreamObserver;

public class BankService extends BankServiceGrpc.BankServiceImplBase {

    @Override
    public void getAccountBalance(BalanceCheckRequest request, StreamObserver<AccountBalance> responseObserver) {
        int accountNumber = request.getAccountNumber();
        AccountBalance accountBalance = AccountBalance.newBuilder()
                .setAccountNumber(accountNumber)
                .setBalance(accountNumber * 10).build();
        responseObserver.onNext(accountBalance);
        responseObserver.onCompleted();
    }
}
