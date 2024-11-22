package sec03;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.protobuf.InvalidProtocolBufferException;
import com.grpc.models.sec02.Person;
import io.grpc.netty.shaded.io.netty.util.collection.ByteObjectMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sec02.ProtoSeralization;

import java.io.IOException;

public class TestPerformance {
    private static final Logger log  = LoggerFactory.getLogger(TestPerformance.class);
    private static final ObjectMapper mapper = new ObjectMapper();

    public static void main(String[] args) {
        Person person = Person.newBuilder().setName("John").setAge(44).build();
        JsonPerson jsonPerson = new JsonPerson("John", 44);
        json(jsonPerson);
        proto(person);


        /*for (int i = 0; i < 5; i++){
            runTest("json", () -> json(jsonPerson));
            runTest("proto", () -> proto(person));
        }*/

    }

    private static void proto(Person person)  {
       byte[] bytes =  person.toByteArray();
        try {
            log.info("proto bytes length: {}", bytes.length);
            Person.parseFrom(bytes);
        } catch (InvalidProtocolBufferException e) {
            throw new RuntimeException(e);
        }
    }

    private static void json(JsonPerson jsonPerson) {
        try{
            byte[] bytes  = mapper.writeValueAsBytes(jsonPerson);
            log.info("json bytes length: {}", bytes.length);
            mapper.readValue(bytes, JsonPerson.class);

        }catch (IOException ex){
            System.out.println(ex.getCause());
        }


    }

    private static void runTest(String test, Runnable runnable){
        long start = System.currentTimeMillis();
        for(int i = 0; i < 5_000_000; i++){
            runnable.run();
        }

        long end = System.currentTimeMillis();
        log.info("{} - {}", test, (end-start));
    }
}

