package ecommerce;

import io.grpc.Status;
import io.grpc.StatusException;
import io.grpc.stub.StreamObserver;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ProductInfoImpl extends ProductInfoGrpc.ProductInfoImplBase {
  private Map productMap = new HashMap<String, ProductInfoOuterClass.Product>();

  @Override
  public void addProduct(ProductInfoOuterClass.Product request, StreamObserver<ProductInfoOuterClass.ProductId> responseObserver) {

  }

  @Override
  public void getProduct(ProductInfoOuterClass.ProductId request, StreamObserver<ProductInfoOuterClass.Product> responseObserver) {

  }
}
