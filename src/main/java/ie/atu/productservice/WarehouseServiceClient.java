package ie.atu.productservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "WarehouseService", url = "https://localhost:8081")
public interface WarehouseServiceClient {
    @PostMapping("/Confirm-capacity")
    String someDetails(@RequestBody ProductService productService);
}
