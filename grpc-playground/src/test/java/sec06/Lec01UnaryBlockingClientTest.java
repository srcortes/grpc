package sec06;


import com.google.protobuf.Empty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Lec01UnaryBlockingClientTest extends AbstractTest{

    private  static final Logger logger
            = LoggerFactory.getLogger(Lec01UnaryBlockingClientTest.class);

    @Test
    public void getBalanceTest(){
        var request = com.grpc.models.sec06.BalanceCheckRequest
                .newBuilder().setAccountNumber(1).build();
        var balance = this.blockingStub
                .getAccountBalance(request);
        logger.info("unary balance received: {}", balance);
        Assertions.assertEquals(100, balance.getBalance());
    }

    @Test
    public void allAccountTest(){
        var allAccount = this.blockingStub.getAllAcount(Empty.getDefaultInstance());
        logger.info("all accounts: {}", allAccount.getAccountCount());
        Assertions.assertEquals(10, allAccount.getAccountCount());


    }

}
