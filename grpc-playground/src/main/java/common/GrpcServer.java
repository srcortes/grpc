package common;

import io.grpc.*;
import sec06.BankService;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GrpcServer {

    private final Server server;

    private GrpcServer(Server server){
        this.server = server;
    }

    public static GrpcServer create(BindableService... services){
        return create(6565, services);
    }

    public static GrpcServer create(int port, BindableService... services){
        ServerBuilder builder = ServerBuilder.forPort(port);
        Arrays.asList(services).forEach(builder::addService);
        return new GrpcServer(builder.build());

    }

    public GrpcServer start() throws IOException {
        List<String> services = server.getServices().stream()
                .map(ServerServiceDefinition::getServiceDescriptor)
                .map(ServiceDescriptor::getName).collect(Collectors.toList());
        server.start();
        return this;
    }

    public void await() throws InterruptedException {
        server.awaitTermination();
    }

    public void stop(){
        server.shutdownNow();
    }

}
