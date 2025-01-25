package sec06;

import com.grpc.models.sec06.TransferRequest;
import com.grpc.models.sec06.TransferResponse;
import com.grpc.models.sec06.TransferServiceGrpc;
import io.grpc.stub.StreamObserver;
import sec06.requesthandlers.TransferRequestHandler;

public class TransferService extends TransferServiceGrpc.TransferServiceImplBase {
    @Override
    public StreamObserver<TransferRequest> transfer(StreamObserver<TransferResponse> responseObserver) {
        return new TransferRequestHandler(responseObserver);
    }
}
