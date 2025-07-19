package common;

import io.grpc.*;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
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
        ServerBuilder<?> builder = ServerBuilder.forPort(port)
                .keepAliveTime(20, TimeUnit.SECONDS)
                .keepAliveTimeout(1, TimeUnit.SECONDS)
                .maxConnectionIdle(1, TimeUnit.SECONDS);
        Arrays.asList(services).forEach(builder::addService);
        return new GrpcServer(builder.build());

    }

    public GrpcServer start() throws IOException {
        server.getServices().stream()
                .map(ServerServiceDefinition::getServiceDescriptor)
                .map(ServiceDescriptor::getName).collect(Collectors.toList());
        server.start();
        return this;
    }

    public void await() throws InterruptedException {
        server.awaitTermination();
    }

    public void stop(){
        System.out.println("stoped");
        server.shutdownNow();
    }

}
