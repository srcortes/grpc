package sec09.validator;

import com.grpc.models.sec10.ValidationCode;
import io.grpc.Metadata;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.protobuf.ProtoUtils;

import java.util.Optional;

public class RequestValidator {

    public static Optional<StatusRuntimeException> validateAccount(int accountNumber) {
        if(accountNumber >  0 && accountNumber < 11) {
            return Optional.empty();
        }
        //This is a way to handle the error
        Metadata metadata = getMetadata(ValidationCode.INVALID_ACCOUNT);
        return Optional.of(Status.INVALID_ARGUMENT
                .asRuntimeException(metadata));
    }

    public static Optional<StatusRuntimeException> isAmountDivisibleBy10(int amount) {
        if(amount > 0 && amount % 10 == 0) {
            return Optional.empty();
        }
        Metadata metadata = getMetadata(ValidationCode.INVALID_AMOUNT);
        return Optional.of(Status.INVALID_ARGUMENT.asRuntimeException(metadata));
    }

    public static Optional<StatusRuntimeException> hasSufficientBalance(int amount, int balance) {
        if(amount <= balance) {
            return Optional.empty();
        }
        Metadata metadata = getMetadata(ValidationCode.INSUFFICIENT_BALANCE);
        return Optional.of(Status.FAILED_PRECONDITION.asRuntimeException(metadata));
    }

    public static Metadata getMetadata(com.grpc.models.sec10.ValidationCode validationCode) {
        Metadata metadata = new Metadata();
        metadata.put(ProtoUtils.keyForProto(com.grpc.models.sec10.ErrorMessage.getDefaultInstance()),
                com.grpc.models.sec10.ErrorMessage.newBuilder().setValidationCode(validationCode).build());
        return metadata;
    }
}
