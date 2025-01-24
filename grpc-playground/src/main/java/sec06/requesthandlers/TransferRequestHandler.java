package sec06.requesthandlers;

import com.grpc.models.sec06.TransferRequest;
import io.grpc.stub.StreamObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sec06.repository.AccountRepository;

import java.util.function.BooleanSupplier;

public class TransferRequestHandler implements StreamObserver<com.grpc.models.sec06.TransferRequest> {

    private static final Logger logger = LoggerFactory.getLogger(TransferRequestHandler.class);
    private final StreamObserver<com.grpc.models.sec06.TransferResponse> responseObserver;

    public TransferRequestHandler(StreamObserver<com.grpc.models.sec06.TransferResponse> responseObserver) {
        this.responseObserver = responseObserver;
    }

    @Override
    public void onNext(TransferRequest transferRequest) {

    }

    @Override
    public void onError(Throwable throwable) {

    }

    @Override
    public void onCompleted() {

    }

    private com.grpc.models.sec06.TransferStatus transfer(TransferRequest transferRequest) {
        var amount = transferRequest.getAmount();
        var fromAccount = transferRequest.getFromAccount();
        var toAccount = transferRequest.getToAccount();
        boolean validatingAccount = validateAccount(() -> AccountRepository.getBalance(fromAccount) >= amount
                && (fromAccount != toAccount));
        if(validatingAccount){
            AccountRepository.addAmount(fromAccount, amount);
            AccountRepository.addAmount(toAccount, amount);
        } else {
            logger.error("Transfer failed due to insufficient balance or invalid account number");
            return com.grpc.models.sec06.TransferStatus.FAILED;
        }
        return com.grpc.models.sec06.TransferStatus.SUCCESS;
    }

    private boolean validateAccount(BooleanSupplier accountValidator) {
        return accountValidator.getAsBoolean();
    }
}
