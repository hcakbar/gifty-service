package com.gifty.service.repository;

import com.gifty.service.domain.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by hcakb on 10/7/2017.
 */

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {

}
