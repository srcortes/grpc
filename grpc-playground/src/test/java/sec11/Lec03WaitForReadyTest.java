package sec11;

import com.google.common.util.concurrent.Uninterruptibles;
import com.grpc.models.sec11.WithDrawRequest;
import common.GrpcServer;
import io.grpc.Deadline;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import common.AbstractChannelTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class Lec03WaitForReadyTest extends AbstractChannelTest{
    private static final Logger log = LoggerFactory.getLogger(Lec03WaitForReadyTest.class);
    private final GrpcServer grpcServer = GrpcServer.create(new DeadLineBankService());
    private com.grpc.models.sec11.BankServiceGrpc.BankServiceBlockingStub bankServiceBlockingStub;

    @BeforeAll
    void setup() throws IOException {

            Uninterruptibles.sleepUninterruptibly(120, TimeUnit.SECONDS);

                this.grpcServer.start();



        this.bankServiceBlockingStub = com.grpc.models.sec11.BankServiceGrpc.newBlockingStub(channel);
    }

    @Test
    void blockingDeadLineTest(){

            var request = WithDrawRequest.newBuilder()
                    .setAccountNumber(1)
                    .setAmount(50)
                    .build();
            var iterator = this.bankServiceBlockingStub
                    .withWaitForReady()
                    .withDraw(request);
            while(iterator.hasNext()){
                log.info("{}", iterator.next());
            }
    }

    @AfterAll
    void stop(){
        this.grpcServer.stop();
    }
}
