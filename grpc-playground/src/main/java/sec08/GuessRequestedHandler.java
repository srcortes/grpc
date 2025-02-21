package sec08;

import com.grpc.models.sec08.GuessRequest;
import com.grpc.models.sec08.GuessResponse;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.ThreadLocalRandom;

public class GuessRequestedHandler implements StreamObserver<com.grpc.models.sec08.GuessRequest> {

    private final StreamObserver<GuessResponse> responseObserver;
    private final int secretNumber;

    private int attempt;


    public GuessRequestedHandler(StreamObserver<GuessResponse> responseObserver) {
        this.responseObserver = responseObserver;
        this.secretNumber = ThreadLocalRandom.current().nextInt(1, 101);
        this.attempt = 0;
    }


    @Override
    public void onNext(GuessRequest guessRequest) {
        if (guessRequest.getGuess() > secretNumber) {

        }
    }

    @Override
    public void onError(Throwable throwable) {

    }

    @Override
    public void onCompleted() {

    }
}


