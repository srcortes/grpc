package sec01;

import com.grpc.models.sec02.Person;
import com.grpc.models.sec03.JobPerson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;




public class SimpleProtoDemo {

    private static final Logger log = LoggerFactory.getLogger(SimpleProtoDemo.class);

    private static Person createPerson(){
        return Person.newBuilder().setName("John").setAge(44).build();
    }


    public static void main(String[] args) {
        Person person = createPerson();
        log.info("{}", person);

        Person person1 = person.toBuilder().setName("July").setAge(41).build();
        log.info("{}", person1);



        JobPerson.Jobs jobPerson = JobPerson.Jobs.newBuilder().setPerson(JobPerson.Person.newBuilder().setName("John")
                .build()).setIsWork(true).build();
    }
}
