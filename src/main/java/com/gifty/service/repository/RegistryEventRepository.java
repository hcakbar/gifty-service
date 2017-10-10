package com.gifty.service.repository;

import com.gifty.service.domain.RegistryEvent;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by hcakb on 10/8/2017.
 */

@Repository
public interface RegistryEventRepository extends MongoRepository<RegistryEvent, String> {

}
