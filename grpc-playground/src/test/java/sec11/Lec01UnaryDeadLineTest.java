package sec11;

import io.grpc.Deadline;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;


public class Lec01UnaryDeadLineTest extends AbstractTest{
    private static final Logger log = LoggerFactory.getLogger(Lec01UnaryDeadLineTest.class);

    @Test
    void blockingDeadLineTest(){
        var request = com.grpc.models.sec11.BalanceCheckRequest.newBuilder()
                .setAccountNumber(1).build();

        var response = this.bankServiceBlockingStub
                .withDeadline(Deadline.after(10, TimeUnit.SECONDS))
                .getAccountBalance(request);
        log.info("{}", response);
    }

}
