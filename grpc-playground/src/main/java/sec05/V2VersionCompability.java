package sec05;

import com.google.protobuf.InvalidProtocolBufferException;
import com.grpc.models.sec05.v2.Television;
import com.grpc.models.sec05.v2.Type;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sec05.parser.V1parser;
import sec05.parser.V2parser;

public class V2VersionCompability {

    private static final Logger log  = LoggerFactory.getLogger(V2VersionCompability.class);

    public static void main(String[] args) throws InvalidProtocolBufferException {
        Television tv = Television.newBuilder()
                .setBrand("SAMSUNG")
                .setModel(2023)
                .setType(Type.UHD)
                .build();

        V1parser.parse(tv.toByteArray());
        V2parser.parse(tv.toByteArray());

    }
}
