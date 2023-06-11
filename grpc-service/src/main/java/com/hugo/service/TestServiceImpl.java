package com.hugo.service;

import com.hugo.TestProto;
import com.hugo.TestServiceGrpc;
import io.grpc.stub.StreamObserver;

public class TestServiceImpl extends TestServiceGrpc.TestServiceImplBase {
    @Override
    public void test(TestProto.TestRequest request, StreamObserver<TestProto.TestResponse> responseObserver) {
        System.out.println(request.getName());
        responseObserver.onNext(TestProto.TestResponse.newBuilder().setResult("Test response").build());
        responseObserver.onCompleted();
    }
}
