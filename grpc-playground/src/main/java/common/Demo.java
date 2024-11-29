package common;

import sec06.BankService;

import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException, InterruptedException {
        GrpcServer.create(new BankService())
                .start().await();
    }
}
