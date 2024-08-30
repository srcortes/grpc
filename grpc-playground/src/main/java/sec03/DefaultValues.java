package sec03;

import com.grpc.models.sec04.Car;
import com.grpc.models.sec04.School;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DefaultValues {
    private static final Logger log  = LoggerFactory.getLogger(DefaultValues.class);

    public static void main(String[] args) {
        School school  = School.newBuilder().build();
        log.info("{}", school.getName());

        Car car  = Car.newBuilder().build();
        log.info("{}", car.getType());



    }
}
