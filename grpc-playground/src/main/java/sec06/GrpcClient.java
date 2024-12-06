package sec06;


import com.grpc.models.sec06.AccountBalance;
import io.grpc.ManagedChannelBuilder;
import com.grpc.models.sec06.BankServiceGrpc;
import com.grpc.models.sec06.BalanceCheckRequest;
import io.grpc.stub.StreamObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class GrpcClient {

    private static final Logger log = LoggerFactory.getLogger(GrpcClient.class);

    public static void main(String[] args) throws InterruptedException {
        var channel = ManagedChannelBuilder.forAddress("localhost", 6565)
                .usePlaintext().build();
        BankServiceGrpc.BankServiceStub stub = BankServiceGrpc.newStub(channel);
        stub.getAccountBalance(BalanceCheckRequest.newBuilder().setAccountNumber(10) .build(),
                new StreamObserver<AccountBalance>(){
            @Override
            public void onNext(AccountBalance accountBalance) {
                log.info("{}::::", accountBalance);
            }
            @Override
            public void onError(Throwable throwable) {

            }
            @Override
            public void onCompleted() {
                log.info("Completed");
            }
        });
        log.info("Done");
        Thread.sleep(10);
    }
}
