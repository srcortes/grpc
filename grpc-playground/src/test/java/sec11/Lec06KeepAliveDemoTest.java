package sec11;

import com.google.common.util.concurrent.Uninterruptibles;


import com.grpc.models.sec11.BalanceCheckRequest;
import com.grpc.models.sec11.BankServiceGrpc;
import common.AbstractChannelTest;
import common.GrpcServer;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class Lec06KeepAliveDemoTest extends AbstractChannelTest {
    private static final Logger log = LoggerFactory.getLogger(Lec06KeepAliveDemoTest.class);
    private final GrpcServer grpcServer = GrpcServer.create(new DeadLineBankService());
    private BankServiceGrpc.BankServiceBlockingStub bankServiceBlockingStub;

    @BeforeAll
    void setup() throws IOException {
      this.grpcServer.start();
      this.bankServiceBlockingStub = BankServiceGrpc.newBlockingStub(channel);
    }

    @Test
    void lazyChannelDemo(){
        var request = BalanceCheckRequest.newBuilder()
                .setAccountNumber(1)
                .build();
        var response = this.bankServiceBlockingStub.getAccountBalance(request);
        log.info("{}", response);


    }
}
