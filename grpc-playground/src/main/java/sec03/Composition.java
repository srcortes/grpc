package sec03;

import com.grpc.models.sec04.Address;
import com.grpc.models.sec04.School;
import com.grpc.models.sec04.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Composition {
    private static final Logger log  = LoggerFactory.getLogger(Composition.class);

    public static void main(String[] args) {
        Address address = Address.newBuilder()
                .setStreet("Calle 148")
                .setCity("Bogota")
                .setState("Usaquen").build();

        Student student = Student.newBuilder()
                .setName("John")
                .setAddress(address).build();

        School school = School.newBuilder()
                .setName("Javeriana university")
                .setAddress(address.toBuilder()
                        .setStreet("Calle 45")
                        .setCity("Bogota")
                        .setState("Chapinero")).build();

        log.info("School {}", school);
        log.info("School {}", student);
    }
}
