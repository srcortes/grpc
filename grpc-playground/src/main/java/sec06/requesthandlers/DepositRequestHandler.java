package sec06.requesthandlers;

import com.grpc.models.sec06.DepositRequest;
import io.grpc.stub.StreamObserver;
import sec06.repository.AccountRepository;

import java.util.logging.Logger;

public class DepositRequestHandler implements StreamObserver<com.grpc.models.sec06.DepositRequest> {

    private final StreamObserver<com.grpc.models.sec06.AccountBalance> responseObserver;

    private static final Logger logger = Logger.getLogger(DepositRequestHandler.class.getName());
    private int accountNumber;

    public DepositRequestHandler(StreamObserver<com.grpc.models.sec06.AccountBalance> responseObserver) {
        this.responseObserver = responseObserver;
    }

    @Override
    public void onNext(DepositRequest depositRequest) {
        switch (depositRequest.getRequestCase()){
            case ACCOUNT_NUMBER -> this.accountNumber = depositRequest.getAccountNumber();
            case MONEY -> AccountRepository.addAmount(this.accountNumber, depositRequest.getMoney().getAmount());
        }


    }

    @Override
    public void onError(Throwable throwable) {
        logger.info("Error occurred while processing the request: " + throwable.getMessage());
    }

    @Override
    public void onCompleted() {
        com.grpc.models.sec06.AccountBalance accountBalance = com.grpc.models.sec06.AccountBalance.newBuilder()
                .setAccountNumber(this.accountNumber)
                .setBalance(AccountRepository.getBalance(this.accountNumber))
                .build();
        responseObserver.onNext(accountBalance);
        responseObserver.onCompleted();
    }
}
