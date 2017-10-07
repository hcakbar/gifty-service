package controller;

import domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import service.ProductService;

import java.util.List;

@RestController
@RequestMapping(value = MappingConstants.PRODUCTS, produces = MediaType.APPLICATION_JSON_VALUE)
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping(value = MappingConstants.ALL)
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping(MappingConstants.ALL + "/{id}")
    public Product getProductBy(@PathVariable String id) {
        return productService.getProductById(id);
    }

    @PostMapping(MappingConstants.ALL)
    public String addProduct(@RequestBody Product product) {
        productService.addProduct(product);
        return "Product " + product.getName() + " added successfully";
    }


}
