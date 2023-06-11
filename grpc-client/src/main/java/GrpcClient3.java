import com.hugo.HelloProto;
import com.hugo.HelloServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Iterator;

public class GrpcClient3 {
    public static void main(String[] args) {

            //1. Create Channel
            ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9000).usePlaintext().build();
        try {
            //2. Create Stub
            HelloServiceGrpc.HelloServiceBlockingStub serviceBlockingStub = HelloServiceGrpc.newBlockingStub(channel);

            //3. Create Request
            HelloProto.HelloRequest.Builder builder = HelloProto.HelloRequest.newBuilder();
            builder.setName("Hugo1");
            HelloProto.HelloRequest request = builder.build();

            //4. Call
            Iterator<HelloProto.HelloResponse> helloResponseIterator = serviceBlockingStub.hello3(request);
            while (helloResponseIterator.hasNext()){
                HelloProto.HelloResponse helloResponse = helloResponseIterator.next();
                System.out.println(helloResponse.getResult());
            }
        } finally {
            channel.shutdown();
        }
    }
}
