package common;

import sec06.BankService;
import sec06.TransferService;
import sec07.FlowControlService;

import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException, InterruptedException {
        GrpcServer.create( new FlowControlService())
                .start().await();
    }
}
