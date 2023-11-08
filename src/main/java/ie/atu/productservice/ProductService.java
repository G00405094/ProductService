package ie.atu.productservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.invoke.StringConcatException;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductService {
    private String addProduct;
    private String getProductId;
    private String quantity;
    private String wareHouseId;
    private String capacity;
    private String location;
}
