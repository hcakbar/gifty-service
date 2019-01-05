package com.gifty.service.repository;

import com.gifty.service.domain.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by hcakb on 10/11/2017.
 */

@Repository
public interface ProfileRepository extends MongoRepository<Profile, String> {

}
