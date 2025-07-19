package sec06;

import com.grpc.models.sec06.BankServiceGrpc;
import common.AbstractChannelTest;
import common.GrpcServer;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import java.io.IOException;

public class AbstractTest extends AbstractChannelTest {
    private final GrpcServer grpcServer = GrpcServer
            .create(new BankService());
    protected BankServiceGrpc.BankServiceBlockingStub blockingStub;

    @BeforeAll
    public void setup() throws IOException {
        this.grpcServer.start();
        this.blockingStub = com.grpc.models.sec06
                .BankServiceGrpc.newBlockingStub(channel);
    }

    @AfterAll
    public void stop(){
        this.grpcServer.stop();
    }


}
