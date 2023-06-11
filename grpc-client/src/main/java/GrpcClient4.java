import com.hugo.HelloProto;
import com.hugo.HelloServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.TimeUnit;

public class GrpcClient4 {
    public static void main(String[] args) {
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost",9000).usePlaintext().build();
        try{
            HelloServiceGrpc.HelloServiceStub stub = HelloServiceGrpc.newStub(managedChannel);

            HelloProto.HelloRequest request = HelloProto.HelloRequest.newBuilder().setName("Hugo").build();
            stub.hello3(request, new StreamObserver<HelloProto.HelloResponse>() {
                @Override
                public void onNext(HelloProto.HelloResponse helloResponse) {
                    System.out.println("get message " + helloResponse.getResult());
                }

                @Override
                public void onError(Throwable throwable) {

                }

                @Override
                public void onCompleted() {
                    System.out.println("streaming finished");
                }
            });

            managedChannel.awaitTermination(20, TimeUnit.SECONDS);
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            managedChannel.shutdown();
        }
    }
}
