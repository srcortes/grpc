package sec03;


import com.grpc.models.sec04.Credentials;
import com.grpc.models.sec04.Email;
import com.grpc.models.sec04.Person;
import com.grpc.models.sec04.Phone;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class OneOf {
    private static final Logger log  = LoggerFactory.getLogger(OneOf.class);

    public static void main(String[]args){

        Credentials credentials = Credentials.newBuilder()
                .setEmail(Email.newBuilder()
                        .setAddress("john.rodriguez.cortes@protonmail.com")
                        .setPassword("**********")
                        .build()).build();


        Person person = Person.newBuilder().setName("John Rodriguez")
                .setEmail(credentials.getEmail()).build();

        Person person1 = login(credentials, person);
        System.out.println(person1);


    }

    private static Person login(Credentials credentials, Person person){
        switch (credentials.getLoginTypeCase()) {
            case EMAIL -> {
                return Person.newBuilder().setName(person.getName())
                        .setEmail(person.getEmail()).build();

            }
            case PHOE -> {
                return Person.newBuilder().setName(person.getName())
                        .setPhone(person.getPhone()).build();
            }
            default -> {
                throw new RuntimeException("Invalid option");
            }

        }
    }

}
