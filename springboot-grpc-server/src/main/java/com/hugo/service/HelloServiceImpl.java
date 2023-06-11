package com.hugo.service;

import com.hugo.HelloProto;
import com.hugo.HelloServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class HelloServiceImpl extends HelloServiceGrpc.HelloServiceImplBase {
    @Override
    public void hello(HelloProto.HelloRequest request, StreamObserver<HelloProto.HelloResponse> responseObserver) {
        System.out.println(request.getName());
        responseObserver.onNext(HelloProto.HelloResponse.newBuilder().setResult("Hello,"+request.getName()).build());
        responseObserver.onCompleted();
    }
}
