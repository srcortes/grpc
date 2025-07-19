package sec11;

import common.AbstractChannelTest;
import common.GrpcServer;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import java.io.IOException;

public class AbstractTest extends AbstractChannelTest {

    private final GrpcServer grpcServer = GrpcServer.create(new DeadLineBankService());
    protected com.grpc.models.sec11.BankServiceGrpc.BankServiceStub bankServiceStub;
    protected com.grpc.models.sec11.BankServiceGrpc.BankServiceBlockingStub bankServiceBlockingStub;

    @BeforeAll
    void setup() throws IOException {
        this.grpcServer.start();
        this.bankServiceStub = com.grpc.models.sec11.BankServiceGrpc.newStub(channel);
        this.bankServiceBlockingStub = com.grpc.models.sec11.BankServiceGrpc.newBlockingStub(channel);
    }

    @AfterAll
    void stop(){
        this.grpcServer.stop();
    }

}
