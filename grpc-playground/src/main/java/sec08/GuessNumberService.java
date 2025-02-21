package sec08;

import com.grpc.models.sec08.GuessNumberGrpc;
import com.grpc.models.sec08.GuessRequest;
import com.grpc.models.sec08.GuessResponse;
import io.grpc.stub.StreamObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GuessNumberService extends GuessNumberGrpc.GuessNumberImplBase {

    private static final Logger log = LoggerFactory.getLogger(GuessNumberService.class);

    @Override
    public StreamObserver<GuessRequest> makeGuess(StreamObserver<GuessResponse> responseObserver) {
        return new GuessRequestedHandler(responseObserver);
    }
}
