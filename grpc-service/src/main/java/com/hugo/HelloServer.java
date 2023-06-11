package com.hugo;

import com.hugo.service.HelloServiceImpl;
import com.hugo.service.TestServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class HelloServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        ServerBuilder builder = ServerBuilder.forPort(8888);
        builder.addService(new HelloServiceImpl());
        builder.addService(new TestServiceImpl());
        Server server = builder.build();
        server.start();
        server.awaitTermination();
    }
}
