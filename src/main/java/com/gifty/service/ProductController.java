package com.gifty.service;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = MappingConstants.PRODUCTS, produces = MediaType.APPLICATION_JSON_VALUE)
public class ProductController {

    private ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

//    @Autowired
//    private ProductService productService;

//    @GetMapping(value = MappingConstants.ALL)
//    public List<com.gifty.service.Product> getAllProducts() {
//        return productService.getAllProducts();
//    }

    @GetMapping(MappingConstants.ALL)
    public List<Product> getAllProducts() {
        List<Product> products = this.productRepository.findAll();
        return products;
    }

    @PostMapping
    public void addProduct(@RequestBody Product product) {
        this.productRepository.insert(product);
    }

    @PutMapping
    public void updateProduct(@RequestBody Product product) {
        this.productRepository.save(product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable("id") String id) {
        this.productRepository.delete(id);
    }


}
