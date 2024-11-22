package sec05.parser;

import com.google.protobuf.InvalidProtocolBufferException;
import com.grpc.models.sec05.v2.Television;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class V2parser {
    private static final Logger log  = LoggerFactory.getLogger(V2parser.class);

    public static void parse(byte[] bytes) throws InvalidProtocolBufferException {

        Television tv = Television.parseFrom(bytes);
        log.info("Brand{}", tv.getBrand());
        log.info("Year{}", tv.getModel());
        log.info("Type{}", tv.getType());



    }
}
