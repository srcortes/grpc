package sec07;

import com.grpc.models.sec06.FlowControlServiceGrpc;
import com.grpc.models.sec06.Output;
import com.grpc.models.sec06.RequestSize;
import io.grpc.stub.StreamObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.stream.IntStream;

public class FlowControlService extends FlowControlServiceGrpc.FlowControlServiceImplBase {

    private static final Logger log = LoggerFactory.getLogger(FlowControlService.class);

    @Override
    public StreamObserver<RequestSize> getMessages(StreamObserver<Output> responseObserver) {
        return new RequestHandler(responseObserver);
    }

    private static class RequestHandler implements StreamObserver<RequestSize> {
        private final StreamObserver<Output> responseObserver;
        private Integer emmitted;


        public RequestHandler(StreamObserver<Output> responseObserver) {
            this.responseObserver = responseObserver;
            this.emmitted = 0;
        }

        @Override
        public void onNext(RequestSize requestSize) {
            IntStream.rangeClosed(emmitted + 1, 100).limit(requestSize.getSize()).forEach(i -> {
                responseObserver.onNext(Output.newBuilder().setValue(i).build());
            });
            emmitted = requestSize.getSize();
            if(emmitted >= 100) {
                onCompleted();
            }
        }

        @Override
        public void onError(Throwable t) {
            log.error("Error occurred in request handler", t);
        }

        @Override
        public void onCompleted() {
            responseObserver.onCompleted();
        }
    }
}
