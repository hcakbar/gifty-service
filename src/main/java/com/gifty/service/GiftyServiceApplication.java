package com.gifty.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.gifty.service")
@EnableMongoRepositories("com.gifty.service.repository")
public class GiftyServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GiftyServiceApplication.class, args);
    }

}
