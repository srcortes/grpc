package common;


import sec06.TransferService;
import sec07.FlowControlService;
import sec09.BankService;

import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException, InterruptedException {
        GrpcServer.create( new BankService())
                .start().await();
    }
}
