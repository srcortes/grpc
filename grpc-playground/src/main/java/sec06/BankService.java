package sec06;

import com.google.protobuf.Empty;
import com.grpc.models.sec06.AccountBalance;
import com.grpc.models.sec06.AllAccountResponse;
import com.grpc.models.sec06.BalanceCheckRequest;
import com.grpc.models.sec06.BankServiceGrpc;
import io.grpc.stub.StreamObserver;
import sec06.repository.AccountRepository;

public class BankService extends BankServiceGrpc.BankServiceImplBase {

    @Override
    public void getAccountBalance(BalanceCheckRequest request, StreamObserver<AccountBalance> responseObserver) {
        int accountNumber = request.getAccountNumber();

        AccountBalance accountBalance = AccountBalance.newBuilder()
                .setAccountNumber(accountNumber)
                .setBalance(AccountRepository.getBalance(accountNumber)).build();
        responseObserver.onNext(accountBalance);
        responseObserver.onCompleted();
    }

    @Override
    public void getAllAcount(Empty request, StreamObserver<AllAccountResponse> responseObserver) {
        var acount = AccountRepository.getAllAccount()
                .entrySet().stream()
                .map(e -> AccountBalance.newBuilder()
                        .setAccountNumber(e.getKey())
                        .setBalance(e.getValue()).build())
                .toList();
        var response = AllAccountResponse
                .newBuilder().addAllAccount(acount)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
