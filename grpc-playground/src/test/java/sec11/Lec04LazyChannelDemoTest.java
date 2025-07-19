package sec11;

import com.google.common.util.concurrent.Uninterruptibles;
import com.grpc.models.sec11.BalanceCheckRequest;
import com.grpc.models.sec11.BankServiceGrpc;
import common.AbstractChannelTest;
import common.GrpcServer;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Lec04LazyChannelDemoTest extends AbstractChannelTest {
    private static final Logger log = LoggerFactory.getLogger(Lec04LazyChannelDemoTest.class);
    private final GrpcServer grpcServer = GrpcServer.create(new DeadLineBankService());
    private BankServiceGrpc.BankServiceBlockingStub bankBlockingStub;

    @BeforeAll
    void setup() throws IOException {
        //this.grpcServer.start();
        this.bankBlockingStub = BankServiceGrpc.newBlockingStub(channel);
    }

    @Test
    void lazyChannelDemo(){
        var request = BalanceCheckRequest.newBuilder()
                .setAccountNumber(1).build();
        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
        var response = this.bankBlockingStub.getAccountBalance(request);
        log.info("{}", response);
    }

    @AfterAll
    void stop(){
        this.grpcServer.stop();
    }
}
