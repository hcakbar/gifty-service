package com.gifty.service.controller;

import com.gifty.service.utils.MappingConstants;
import com.gifty.service.domain.Product;
import com.gifty.service.repository.ProductRepository;
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

    @DeleteMapping()
    public void deleteProduct(Product product) {
        this.productRepository.delete(product);
    }


}
