package com.gifty.service;

import com.gifty.service.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


/**
 * Created by hcakb on 10/7/2017.
 */

@Component
public class DbSeeder implements CommandLineRunner {

    private ProductRepository productRepository;

    public DbSeeder(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @Override
    public void run(String... strings) throws Exception {

    }

}
