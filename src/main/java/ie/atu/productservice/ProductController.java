package ie.atu.productservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    private WarehouseServiceClient warehouseServiceClient;

    @Autowired
    public ProductController(WarehouseServiceClient warehouseServiceClient){this.warehouseServiceClient = warehouseServiceClient;}

    @PostMapping("/add-product")
    public String Product(@RequestBody ProductService productService){
        String ProductId = warehouseServiceClient.someDetails(productService);

        String messageResponse = ProductId + "ProductID: " + productService.getGetProductId() + "Can Product be added:" +productService.getAddProduct();
        return messageResponse;
    }
}
