package sec05.parser;

import com.google.protobuf.InvalidProtocolBufferException;
import com.grpc.models.sec05.v1.Television;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sec05.V1VersionCompability;

public class V1parser {
    private static final Logger log  = LoggerFactory.getLogger(V1parser.class);

    public static void parse(byte[] bytes) throws InvalidProtocolBufferException {
        Television tv = Television.parseFrom(bytes);
        log.info("Brand{}", tv.getBrand());
        log.info("Year{}", tv.getYear());

    }

}
