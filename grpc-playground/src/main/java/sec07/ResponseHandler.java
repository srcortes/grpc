package sec07;

import com.google.common.util.concurrent.Uninterruptibles;
import com.grpc.models.sec06.Output;
import io.grpc.stub.StreamObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;



public class ResponseHandler implements StreamObserver<com.grpc.models.sec06.Output> {

    private static final Logger logger = LoggerFactory.getLogger(ResponseHandler.class);
    private final CountDownLatch latch = new CountDownLatch(1);
    private StreamObserver<com.grpc.models.sec06.RequestSize> requestObserver;
    private int size;

    @Override
    public void onNext(Output output) {
        this.size--;
        process(output);
        if(this.size == 0) {
          this.request(3);
        }

    }

    @Override
    public void onError(Throwable throwable) {
       latch.countDown();
    }

    @Override
    public void onCompleted() {
        this.requestObserver.onCompleted();
        logger.info("All processing done");
        latch.countDown();

    }

    public void setRequestObserver(StreamObserver<com.grpc.models.sec06.RequestSize> requestObserver) {
        this.requestObserver = requestObserver;
    }

    public void request(int size) {
       logger.info("Requesting{}", size);
       this.requestObserver.onNext(com.grpc.models.sec06.RequestSize.newBuilder().setSize(size).build());
    }


    private void process(com.grpc.models.sec06.Output output) {
        logger.info("Received: {}", output.getValue());
        Uninterruptibles.sleepUninterruptibly(ThreadLocalRandom.current()
                .nextInt(500, 200), TimeUnit.SECONDS  );
    }

    public void await() {
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        this.request(3);
    }

}
