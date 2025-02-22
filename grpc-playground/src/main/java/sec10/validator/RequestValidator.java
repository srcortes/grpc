package sec10.validator;

import io.grpc.Metadata;
import io.grpc.Status;
import io.grpc.protobuf.ProtoUtils;
import com.grpc.models.sec10.ErrorMessage;
import com.grpc.models.sec10.ValidationCode;


import java.util.Optional;

public class RequestValidator {

    public static Optional<Status> validateAccount(int accountNumber) {
        if(accountNumber >  0 && accountNumber < 11) {
            return Optional.empty();
        }
        return Optional.of(Status.INVALID_ARGUMENT.withDescription("Invalid account number"));
    }

    public static Optional<Status> isAmountDivisibleBy10(int amount) {
        if(amount > 0 && amount % 10 == 0) {
            return Optional.empty();
        }
        return Optional.of(Status.INVALID_ARGUMENT.withDescription("Invalid amount"));
    }

    public static Optional<Status> hasSufficientBalance(int amount, int balance) {
        if(amount <= balance) {
            return Optional.empty();
        }
        return Optional.of(Status.FAILED_PRECONDITION.withDescription("Invalid balance"));
    }

    private static Metadata toMetadata(ValidationCode code) {
        Metadata metadata = new Metadata();
        var key = ProtoUtils.keyForProto(ErrorMessage.getDefaultInstance());
        var errorMessage = ErrorMessage.newBuilder()
                .setValidationCode(code)
                .build();
        metadata.put(key, errorMessage);
        return metadata;
    }
}
