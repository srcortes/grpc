package sec02;

import com.google.protobuf.Message;
import com.grpc.models.sec02.Person;
import com.grpc.models.sec03.JobPerson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class ProtoSeralization {

    private static final Logger log  = LoggerFactory.getLogger(ProtoSeralization.class);
    private static final Path PATH = Path.of("person.out");

    public static void main(String[] args) throws IOException {
        Person person = Person.newBuilder().setName("John").setAge(44).build();
        serialize(person);
        log.info("{}", deserialize());


    }

    public static void serialize(Person person) throws IOException {
        person.writeTo(Files.newOutputStream(PATH));

    }

    public static Person deserialize() throws IOException {
        return Person.parseFrom(Files.newInputStream(PATH));
    }



}
