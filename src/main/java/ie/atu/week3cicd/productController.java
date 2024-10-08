package ie.atu.week3cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/products")

public class productController {
    private List<Product> productList = new ArrayList<>();

    public productController(){
        productList.add(new Product("1","TV","Electronics", 600.0));
        productList.add(new Product("2","Phone","Electronics",500.0));
    }

    @GetMapping
    public List<Product> getAllProducts(){
        return productList;
    }
}
