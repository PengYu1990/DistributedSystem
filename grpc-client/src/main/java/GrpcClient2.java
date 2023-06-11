import com.hugo.HelloProto;
import com.hugo.HelloServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcClient2 {
    public static void main(String[] args) {

            //1. Create Channel
            ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9000).usePlaintext().build();
        try {
            //2. Create Stub
            HelloServiceGrpc.HelloServiceBlockingStub serviceBlockingStub = HelloServiceGrpc.newBlockingStub(channel);

            //3. Create Request
            HelloProto.HelloRequest1.Builder builder = HelloProto.HelloRequest1.newBuilder();
            builder.addName("Hugo1");
            builder.addName("Hugo2");
            builder.addName("Hugo3");
            HelloProto.HelloRequest1 request = builder.build();

            //4. Call
            HelloProto.HelloResponse response = serviceBlockingStub.hello2(request);
            System.out.println(response.getResult());
        } finally {
            channel.shutdown();
        }
    }
}
