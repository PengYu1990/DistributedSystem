package com.hugo.service;

import com.google.protobuf.ProtocolStringList;
import com.hugo.HelloProto;
import com.hugo.HelloServiceGrpc;
import io.grpc.stub.StreamObserver;

public class HelloServiceImpl extends HelloServiceGrpc.HelloServiceImplBase {


    @Override
    public StreamObserver<HelloProto.HelloRequest> hello5(StreamObserver<HelloProto.HelloResponse> responseObserver) {
        return new StreamObserver<HelloProto.HelloRequest>() {
            @Override
            public void onNext(HelloProto.HelloRequest helloRequest) {
                responseObserver.onNext(HelloProto.HelloResponse.newBuilder().setResult("Biodirectional Streaming").build());
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public StreamObserver<HelloProto.HelloRequest> hello4(StreamObserver<HelloProto.HelloResponse> responseObserver) {
        return new StreamObserver<HelloProto.HelloRequest>() {
            @Override
            public void onNext(HelloProto.HelloRequest helloRequest) {
                System.out.println("request: " + helloRequest.getName());
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {
                System.out.println("request finished");
                responseObserver.onNext(HelloProto.HelloResponse.newBuilder().setResult("Result").build());
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public void hello3(HelloProto.HelloRequest request, StreamObserver<HelloProto.HelloResponse> responseObserver) {
        String name = request.getName();

        System.out.println(name);

        for(int i = 0; i < 9; i++) {
            HelloProto.HelloResponse.Builder builder = HelloProto.HelloResponse.newBuilder();
            builder.setResult("Ok " + i);
            HelloProto.HelloResponse helloResponse = builder.build();
            responseObserver.onNext(helloResponse);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        responseObserver.onCompleted();
    }

    @Override
    public void hello(HelloProto.HelloRequest request, StreamObserver<HelloProto.HelloResponse> responseObserver) {
        String name = request.getName();

        HelloProto.HelloResponse.Builder builder = HelloProto.HelloResponse.newBuilder();
        builder.setResult("function invoked");
        HelloProto.HelloResponse response = builder.build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void hello2(HelloProto.HelloRequest1 request, StreamObserver<HelloProto.HelloResponse> responseObserver) {
        ProtocolStringList nameList = request.getNameList();
        for(String name : nameList)
            System.out.println(name);

        HelloProto.HelloResponse.Builder builder = HelloProto.HelloResponse.newBuilder();
        builder.setResult("Ok");
        HelloProto.HelloResponse response = builder.build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
