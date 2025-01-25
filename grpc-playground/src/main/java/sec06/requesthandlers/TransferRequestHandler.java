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
        var status = transfer(transferRequest);
        var response = com.grpc.models.sec06.TransferResponse.newBuilder()
                .setFromAccount(toAccountBalance(transferRequest.getFromAccount()))
                .setToAccount(toAccountBalance(transferRequest.getToAccount()))
                .setStatus(status)
                .build();
        responseObserver.onNext(response);

    }

    @Override
    public void onError(Throwable throwable) {
        logger.error("Error occurred while processing the request: " + throwable.getMessage());
    }

    @Override
    public void onCompleted() {
        responseObserver.onCompleted();
    }

    private com.grpc.models.sec06.TransferStatus transfer(TransferRequest transferRequest) {
        var amount = transferRequest.getAmount();
        var fromAccount = transferRequest.getFromAccount();
        var toAccount = transferRequest.getToAccount();
        var status = com.grpc.models.sec06.TransferStatus.FAIL;
        boolean validatingAccount = validateAccount(() -> AccountRepository.getBalance(fromAccount) >= amount
                && (fromAccount != toAccount));
        if(validatingAccount){
            AccountRepository.deductAmount(fromAccount, amount);
            AccountRepository.addAmount(toAccount, amount);
            status = com.grpc.models.sec06.TransferStatus.SUCCESS;
        }
        return status;
    }
    private com.grpc.models.sec06.AccountBalance toAccountBalance(int accountNumber) {
        return com.grpc.models.sec06.AccountBalance.newBuilder()
                .setAccountNumber(accountNumber)
                .setBalance(AccountRepository.getBalance(accountNumber))
                .build();
    }

    private boolean validateAccount(BooleanSupplier accountValidator) {
        return accountValidator.getAsBoolean();
    }
}
