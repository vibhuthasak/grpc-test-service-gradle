package ecommerce;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class ProductInfoServer {
  public static void main(String[] args) throws IOException, InterruptedException {
    int port = 50051;
    Server server = ServerBuilder.forPort(port).addService(new ProductInfoImpl()).build().start();
    System.out.println("Server Started, Listening on " + port);
    Runtime.getRuntime().addShutdownHook(new Thread(() -> {
      System.err.println("Shutdown hook - grpc Server is shutting down");
      if(server != null){
        server.shutdown();
      }
      System.err.println("Server shut down");
    }));
    server.awaitTermination();
  }
}
