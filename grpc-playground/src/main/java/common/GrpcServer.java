package common;

import io.grpc.ServerBuilder;
import sec06.BankService;

import java.io.IOException;

public class GrpcServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        ServerBuilder.forPort(6565)
                .addService(new BankService())
                .build().start().awaitTermination();
    }
}
