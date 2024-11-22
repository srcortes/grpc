package sec04;

import com.google.protobuf.Int32Value;
import com.google.protobuf.Timestamp;
import com.grpc.models.sec04.Wrapper.Sample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sec03.Collections;

import java.time.Instant;

public class WrapperTypes {
    private static final Logger log  = LoggerFactory.getLogger(WrapperTypes.class);

    public static void main(String[] args) {

        Sample sample = Sample.newBuilder()
                .setAge(Int32Value.of((int) 12.5))
                .setLoginTime(Timestamp.newBuilder()
                        .setSeconds(Instant.now().getEpochSecond()).build())
                .build();
        if(sample.hasNameExample()){
            log.info("{}", Instant.ofEpochSecond(sample.getLoginTime().getSeconds()));
        }else{
            log.info("{}", "....");
        }

    }
}
