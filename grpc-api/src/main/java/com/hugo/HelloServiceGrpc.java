package com.hugo;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.1)",
    comments = "Source: Hello.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class HelloServiceGrpc {

  private HelloServiceGrpc() {}

  public static final String SERVICE_NAME = "HelloService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.hugo.HelloProto.HelloRequest,
      com.hugo.HelloProto.HelloResponse> getHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "hello",
      requestType = com.hugo.HelloProto.HelloRequest.class,
      responseType = com.hugo.HelloProto.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hugo.HelloProto.HelloRequest,
      com.hugo.HelloProto.HelloResponse> getHelloMethod() {
    io.grpc.MethodDescriptor<com.hugo.HelloProto.HelloRequest, com.hugo.HelloProto.HelloResponse> getHelloMethod;
    if ((getHelloMethod = HelloServiceGrpc.getHelloMethod) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getHelloMethod = HelloServiceGrpc.getHelloMethod) == null) {
          HelloServiceGrpc.getHelloMethod = getHelloMethod =
              io.grpc.MethodDescriptor.<com.hugo.HelloProto.HelloRequest, com.hugo.HelloProto.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "hello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hugo.HelloProto.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hugo.HelloProto.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("hello"))
              .build();
        }
      }
    }
    return getHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hugo.HelloProto.HelloRequest1,
      com.hugo.HelloProto.HelloResponse> getHello2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "hello2",
      requestType = com.hugo.HelloProto.HelloRequest1.class,
      responseType = com.hugo.HelloProto.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hugo.HelloProto.HelloRequest1,
      com.hugo.HelloProto.HelloResponse> getHello2Method() {
    io.grpc.MethodDescriptor<com.hugo.HelloProto.HelloRequest1, com.hugo.HelloProto.HelloResponse> getHello2Method;
    if ((getHello2Method = HelloServiceGrpc.getHello2Method) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getHello2Method = HelloServiceGrpc.getHello2Method) == null) {
          HelloServiceGrpc.getHello2Method = getHello2Method =
              io.grpc.MethodDescriptor.<com.hugo.HelloProto.HelloRequest1, com.hugo.HelloProto.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "hello2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hugo.HelloProto.HelloRequest1.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hugo.HelloProto.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("hello2"))
              .build();
        }
      }
    }
    return getHello2Method;
  }

  private static volatile io.grpc.MethodDescriptor<com.hugo.HelloProto.HelloRequest,
      com.hugo.HelloProto.HelloResponse> getHello3Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "hello3",
      requestType = com.hugo.HelloProto.HelloRequest.class,
      responseType = com.hugo.HelloProto.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.hugo.HelloProto.HelloRequest,
      com.hugo.HelloProto.HelloResponse> getHello3Method() {
    io.grpc.MethodDescriptor<com.hugo.HelloProto.HelloRequest, com.hugo.HelloProto.HelloResponse> getHello3Method;
    if ((getHello3Method = HelloServiceGrpc.getHello3Method) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getHello3Method = HelloServiceGrpc.getHello3Method) == null) {
          HelloServiceGrpc.getHello3Method = getHello3Method =
              io.grpc.MethodDescriptor.<com.hugo.HelloProto.HelloRequest, com.hugo.HelloProto.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "hello3"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hugo.HelloProto.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hugo.HelloProto.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("hello3"))
              .build();
        }
      }
    }
    return getHello3Method;
  }

  private static volatile io.grpc.MethodDescriptor<com.hugo.HelloProto.HelloRequest,
      com.hugo.HelloProto.HelloResponse> getHello4Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "hello4",
      requestType = com.hugo.HelloProto.HelloRequest.class,
      responseType = com.hugo.HelloProto.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.hugo.HelloProto.HelloRequest,
      com.hugo.HelloProto.HelloResponse> getHello4Method() {
    io.grpc.MethodDescriptor<com.hugo.HelloProto.HelloRequest, com.hugo.HelloProto.HelloResponse> getHello4Method;
    if ((getHello4Method = HelloServiceGrpc.getHello4Method) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getHello4Method = HelloServiceGrpc.getHello4Method) == null) {
          HelloServiceGrpc.getHello4Method = getHello4Method =
              io.grpc.MethodDescriptor.<com.hugo.HelloProto.HelloRequest, com.hugo.HelloProto.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "hello4"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hugo.HelloProto.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hugo.HelloProto.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("hello4"))
              .build();
        }
      }
    }
    return getHello4Method;
  }

  private static volatile io.grpc.MethodDescriptor<com.hugo.HelloProto.HelloRequest,
      com.hugo.HelloProto.HelloResponse> getHello5Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "hello5",
      requestType = com.hugo.HelloProto.HelloRequest.class,
      responseType = com.hugo.HelloProto.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.hugo.HelloProto.HelloRequest,
      com.hugo.HelloProto.HelloResponse> getHello5Method() {
    io.grpc.MethodDescriptor<com.hugo.HelloProto.HelloRequest, com.hugo.HelloProto.HelloResponse> getHello5Method;
    if ((getHello5Method = HelloServiceGrpc.getHello5Method) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getHello5Method = HelloServiceGrpc.getHello5Method) == null) {
          HelloServiceGrpc.getHello5Method = getHello5Method =
              io.grpc.MethodDescriptor.<com.hugo.HelloProto.HelloRequest, com.hugo.HelloProto.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "hello5"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hugo.HelloProto.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hugo.HelloProto.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("hello5"))
              .build();
        }
      }
    }
    return getHello5Method;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HelloServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloServiceStub>() {
        @java.lang.Override
        public HelloServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloServiceStub(channel, callOptions);
        }
      };
    return HelloServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HelloServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloServiceBlockingStub>() {
        @java.lang.Override
        public HelloServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloServiceBlockingStub(channel, callOptions);
        }
      };
    return HelloServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HelloServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloServiceFutureStub>() {
        @java.lang.Override
        public HelloServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloServiceFutureStub(channel, callOptions);
        }
      };
    return HelloServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void hello(com.hugo.HelloProto.HelloRequest request,
        io.grpc.stub.StreamObserver<com.hugo.HelloProto.HelloResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHelloMethod(), responseObserver);
    }

    /**
     */
    default void hello2(com.hugo.HelloProto.HelloRequest1 request,
        io.grpc.stub.StreamObserver<com.hugo.HelloProto.HelloResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHello2Method(), responseObserver);
    }

    /**
     */
    default void hello3(com.hugo.HelloProto.HelloRequest request,
        io.grpc.stub.StreamObserver<com.hugo.HelloProto.HelloResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHello3Method(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<com.hugo.HelloProto.HelloRequest> hello4(
        io.grpc.stub.StreamObserver<com.hugo.HelloProto.HelloResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getHello4Method(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<com.hugo.HelloProto.HelloRequest> hello5(
        io.grpc.stub.StreamObserver<com.hugo.HelloProto.HelloResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getHello5Method(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service HelloService.
   */
  public static abstract class HelloServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return HelloServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service HelloService.
   */
  public static final class HelloServiceStub
      extends io.grpc.stub.AbstractAsyncStub<HelloServiceStub> {
    private HelloServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloServiceStub(channel, callOptions);
    }

    /**
     */
    public void hello(com.hugo.HelloProto.HelloRequest request,
        io.grpc.stub.StreamObserver<com.hugo.HelloProto.HelloResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHelloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void hello2(com.hugo.HelloProto.HelloRequest1 request,
        io.grpc.stub.StreamObserver<com.hugo.HelloProto.HelloResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHello2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void hello3(com.hugo.HelloProto.HelloRequest request,
        io.grpc.stub.StreamObserver<com.hugo.HelloProto.HelloResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getHello3Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.hugo.HelloProto.HelloRequest> hello4(
        io.grpc.stub.StreamObserver<com.hugo.HelloProto.HelloResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getHello4Method(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.hugo.HelloProto.HelloRequest> hello5(
        io.grpc.stub.StreamObserver<com.hugo.HelloProto.HelloResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getHello5Method(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service HelloService.
   */
  public static final class HelloServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<HelloServiceBlockingStub> {
    private HelloServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.hugo.HelloProto.HelloResponse hello(com.hugo.HelloProto.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHelloMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hugo.HelloProto.HelloResponse hello2(com.hugo.HelloProto.HelloRequest1 request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHello2Method(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.hugo.HelloProto.HelloResponse> hello3(
        com.hugo.HelloProto.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getHello3Method(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service HelloService.
   */
  public static final class HelloServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<HelloServiceFutureStub> {
    private HelloServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hugo.HelloProto.HelloResponse> hello(
        com.hugo.HelloProto.HelloRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHelloMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hugo.HelloProto.HelloResponse> hello2(
        com.hugo.HelloProto.HelloRequest1 request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHello2Method(), getCallOptions()), request);
    }
  }

  private static final int METHODID_HELLO = 0;
  private static final int METHODID_HELLO2 = 1;
  private static final int METHODID_HELLO3 = 2;
  private static final int METHODID_HELLO4 = 3;
  private static final int METHODID_HELLO5 = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_HELLO:
          serviceImpl.hello((com.hugo.HelloProto.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.hugo.HelloProto.HelloResponse>) responseObserver);
          break;
        case METHODID_HELLO2:
          serviceImpl.hello2((com.hugo.HelloProto.HelloRequest1) request,
              (io.grpc.stub.StreamObserver<com.hugo.HelloProto.HelloResponse>) responseObserver);
          break;
        case METHODID_HELLO3:
          serviceImpl.hello3((com.hugo.HelloProto.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.hugo.HelloProto.HelloResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_HELLO4:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.hello4(
              (io.grpc.stub.StreamObserver<com.hugo.HelloProto.HelloResponse>) responseObserver);
        case METHODID_HELLO5:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.hello5(
              (io.grpc.stub.StreamObserver<com.hugo.HelloProto.HelloResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getHelloMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hugo.HelloProto.HelloRequest,
              com.hugo.HelloProto.HelloResponse>(
                service, METHODID_HELLO)))
        .addMethod(
          getHello2Method(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.hugo.HelloProto.HelloRequest1,
              com.hugo.HelloProto.HelloResponse>(
                service, METHODID_HELLO2)))
        .addMethod(
          getHello3Method(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.hugo.HelloProto.HelloRequest,
              com.hugo.HelloProto.HelloResponse>(
                service, METHODID_HELLO3)))
        .addMethod(
          getHello4Method(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              com.hugo.HelloProto.HelloRequest,
              com.hugo.HelloProto.HelloResponse>(
                service, METHODID_HELLO4)))
        .addMethod(
          getHello5Method(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              com.hugo.HelloProto.HelloRequest,
              com.hugo.HelloProto.HelloResponse>(
                service, METHODID_HELLO5)))
        .build();
  }

  private static abstract class HelloServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HelloServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.hugo.HelloProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HelloService");
    }
  }

  private static final class HelloServiceFileDescriptorSupplier
      extends HelloServiceBaseDescriptorSupplier {
    HelloServiceFileDescriptorSupplier() {}
  }

  private static final class HelloServiceMethodDescriptorSupplier
      extends HelloServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HelloServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (HelloServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HelloServiceFileDescriptorSupplier())
              .addMethod(getHelloMethod())
              .addMethod(getHello2Method())
              .addMethod(getHello3Method())
              .addMethod(getHello4Method())
              .addMethod(getHello5Method())
              .build();
        }
      }
    }
    return result;
  }
}
