package controller;
import domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import service.ProductService;

import java.util.List;

@RestController
@RequestMapping(MappingConstants.PRODUCTS)
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = MappingConstants.ALL,
                    method = RequestMethod.GET,
                    produces = MediaType.APPLICATION_JSON_VALUE)

    public List<Product> getAllProducts() {

        return productService.getAllProducts();
    }

}
