package sec05;

import com.google.protobuf.InvalidProtocolBufferException;
import com.grpc.models.sec05.v3.Television;
import com.grpc.models.sec05.v3.Type;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sec05.parser.V1parser;
import sec05.parser.V2parser;
import sec05.parser.V3parser;

public class V3VersionCompability {
    private static final Logger log  = LoggerFactory.getLogger(V3VersionCompability.class);

    public static void main(String[] args) throws InvalidProtocolBufferException {
        Television tv = Television.newBuilder()
                .setBrand("samsung")
                .setType(Type.UHD)
                .build();
        V1parser.parse(tv.toByteArray());
        V2parser.parse(tv.toByteArray());
        V3parser.parse(tv.toByteArray());

    }
}
