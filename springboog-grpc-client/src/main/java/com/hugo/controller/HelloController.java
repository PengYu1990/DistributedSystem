package com.hugo.controller;

import com.hugo.HelloProto;
import com.hugo.HelloServiceGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    @GrpcClient("grpc-server")
    HelloServiceGrpc.HelloServiceBlockingStub stub;


    @GetMapping("/hello")
    public String hello(@RequestParam String name){
        HelloProto.HelloResponse helloResponse = stub.hello(HelloProto.HelloRequest.newBuilder().setName(name).build());
        return helloResponse.getResult();
    }
}
