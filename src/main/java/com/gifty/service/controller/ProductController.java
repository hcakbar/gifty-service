package com.gifty.service.controller;

import com.gifty.service.domain.Product;
import com.gifty.service.repository.ProductRepository;
import com.gifty.service.utils.MappingConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = MappingConstants.PRODUCTS, produces = MediaType.APPLICATION_JSON_VALUE)
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping(MappingConstants.ALL)
    public List<Product> getAllProducts() {

        return productRepository.findAll();
    }

    @PostMapping(MappingConstants.ADD)
    @ResponseStatus(HttpStatus.CREATED)
    public void addProduct(@RequestBody Product product) {

        productRepository.insert(product);
    }

    @PutMapping
    public void updateProduct(@RequestBody Product product) {

        productRepository.save(product);
    }

    @DeleteMapping()
    public void deleteProduct(Product product) {

        productRepository.delete(product);
    }

}
