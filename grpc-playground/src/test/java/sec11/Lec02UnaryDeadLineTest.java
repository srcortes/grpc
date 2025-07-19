package sec11;

import com.google.common.util.concurrent.Uninterruptibles;
import com.grpc.models.sec11.WithDrawRequest;
import io.grpc.Deadline;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class Lec02UnaryDeadLineTest extends AbstractTest {
    private static final Logger log = LoggerFactory.getLogger(Lec02UnaryDeadLineTest.class);


    @Test
    void blockingDeadLineTest(){
        try{
            var request = WithDrawRequest.newBuilder()
                    .setAccountNumber(1)
                    .setAmount(50)
                    .build();
            var iterator = this.bankServiceBlockingStub
                    .withDeadline(Deadline.after(
                            120, TimeUnit.SECONDS))
                    .withDraw(request);
            while(iterator.hasNext()){
                log.info("{}", iterator.next());
                }

        }catch (Exception ex){
            log.info("error");
        }

        Uninterruptibles.sleepUninterruptibly(10, TimeUnit.SECONDS);

    }
}
