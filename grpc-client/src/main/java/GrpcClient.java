import com.hugo.HelloProto;
import com.hugo.HelloServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcClient {
    public static void main(String[] args) {

            //1. Create Channel
            ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8888).usePlaintext().build();
        try {
            //2. Create Stub
            HelloServiceGrpc.HelloServiceBlockingStub serviceBlockingStub = HelloServiceGrpc.newBlockingStub(channel);

            //3. Create Request
            HelloProto.HelloRequest.Builder builder = HelloProto.HelloRequest.newBuilder();
            builder.setName("Hugo");
            HelloProto.HelloRequest request = builder.build();

            //4. Call
            HelloProto.HelloResponse response = serviceBlockingStub.hello(request);
            System.out.println(response.getResult());
        } finally {
            channel.shutdown();
        }
    }
}
