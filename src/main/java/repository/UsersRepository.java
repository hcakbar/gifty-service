package repository;

import domain.Users;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by hcakb on 8/20/2017.
 */

@Repository
public interface UsersRepository extends MongoRepository<Users, String> {

}