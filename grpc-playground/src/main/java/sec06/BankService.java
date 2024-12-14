package sec06;

import com.google.common.util.concurrent.Uninterruptibles;
import com.google.protobuf.Empty;
import com.grpc.models.sec06.*;
import com.grpc.models.sec06.*;
import com.grpc.models.sec06.*;
import com.grpc.models.sec06.AccountBalance;
import com.grpc.models.sec06.AllAccountResponse;
import com.grpc.models.sec06.BalanceCheckRequest;
import com.grpc.models.sec06.BankServiceGrpc;
import io.grpc.stub.StreamObserver;
import sec06.repository.AccountRepository;

import java.util.concurrent.TimeUnit;

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

    @Override
    public void withDraw(com.grpc.models.sec06.WithDrawRequest request, StreamObserver<com.grpc.models.sec06.Money> responseObserver) {
        var accountNumber = request.getAccountNumber();
        var requestAmount = request.getAmount();
        var accountBalance = AccountRepository.getBalance(accountNumber);

        if(requestAmount > accountBalance){
            responseObserver.onCompleted();
        }

        for(int j = 0; j < (requestAmount / 10); j++){
            var money = com.grpc.models.sec06.Money.newBuilder()
                    .setAmount(10).build();
            responseObserver.onNext(money);
            AccountRepository.deductAmount(accountNumber, 10);
            Uninterruptibles.sleepUninterruptibly(1, TimeUnit.SECONDS);
        }
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<com.grpc.models.sec06.DepositRequest> deposit(StreamObserver<AccountBalance> responseObserver) {
        return super.deposit(responseObserver);
    }
}
