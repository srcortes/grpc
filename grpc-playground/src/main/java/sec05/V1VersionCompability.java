package sec05;

import com.google.protobuf.InvalidProtocolBufferException;
import com.grpc.models.sec05.v1.Television;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sec05.parser.V1parser;
import sec05.parser.V2parser;

public class V1VersionCompability{
    private static final Logger log  = LoggerFactory.getLogger(V1VersionCompability.class);

    public static void main(String[] args) throws InvalidProtocolBufferException {
        Television tv = Television.newBuilder()
                .setBrand("Samsung")
                .setYear(2009)
                .build();
        V1parser.parse(tv.toByteArray());
        V2parser.parse(tv.toByteArray());
    }


}
