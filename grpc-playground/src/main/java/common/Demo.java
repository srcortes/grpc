package common;


import sec06.TransferService;
import sec07.FlowControlService;
import sec09.BankService;

import java.io.IOException;

public class Demo {
    /*public static void main(String[] args) throws IOException, InterruptedException {
        GrpcServer.create( new BankService())
                .start().await();
    }*/

    private static class BankInstance1{
        public static void main(String[] args) throws IOException, InterruptedException {
            GrpcServer.create(6565, new BankService()).start().await();
        }
    }

    private static class BankInstance2{
        public static void main(String[] args) throws IOException, InterruptedException {
            GrpcServer.create(7575, new BankService()).start().await();
        }
    }
}
