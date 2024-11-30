package sec06;


import io.grpc.ManagedChannelBuilder;
import com.grpc.models.sec06.BankServiceGrpc;
import com.grpc.models.sec06.BalanceCheckRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GrpcClient {

    private static final Logger log = LoggerFactory.getLogger(GrpcClient.class);

    public static void main(String[] args) {
        var channel = ManagedChannelBuilder.forAddress("localhost", 6565)
                .usePlaintext().build();
        var stub = BankServiceGrpc.newBlockingStub(channel);
        var balance = stub.getAccountBalance(BalanceCheckRequest.newBuilder()
                        .setAccountNumber(10)
                .build());
        log.info("{}", balance);

    }
}
