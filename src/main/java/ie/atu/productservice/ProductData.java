package ie.atu.productservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductData {
    private String Product;
    private String ProductId;
    private String quantity;
    private String wareHouseId;
    private String capacity;
    private String location;
}
