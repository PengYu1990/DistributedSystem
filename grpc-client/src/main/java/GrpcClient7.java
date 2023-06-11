import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.hugo.HelloProto;
import com.hugo.HelloServiceGrpc;
import com.hugo.TestProto;
import com.hugo.TestServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class GrpcClient7 {
    public static void main(String[] args) {
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost",8888).usePlaintext().build();
        try{
            TestServiceGrpc.TestServiceFutureStub testServiceFutureStub = TestServiceGrpc.newFutureStub(managedChannel);
            ListenableFuture<TestProto.TestResponse> responseListenableFuture = testServiceFutureStub.test(TestProto.TestRequest.newBuilder().setName("Hugo").build());

//            TestProto.TestResponse testResponse = responseListenableFuture.get();
//            System.out.println(testResponse.getResult());

            Futures.addCallback(responseListenableFuture, new FutureCallback<TestProto.TestResponse>() {
                @Override
                public void onSuccess(TestProto.TestResponse testResponse) {
                    System.out.println(testResponse.getResult());
                }

                @Override
                public void onFailure(Throwable throwable) {

                }
            }, Executors.newSingleThreadExecutor());

            System.out.println("Continue");

            managedChannel.awaitTermination(20, TimeUnit.SECONDS);
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            managedChannel.shutdown();
        }
    }
}
