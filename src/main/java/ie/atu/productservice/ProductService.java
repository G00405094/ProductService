package ie.atu.productservice;

import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class ProductService {
    public String addProduct(String Product){
        return ("ProductID: " + Product);
    }

    public String getProductID(String ProductID){
        return ("ProductID: " + ProductID);
    }

}
