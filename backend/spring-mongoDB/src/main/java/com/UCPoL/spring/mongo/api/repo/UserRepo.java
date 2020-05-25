package com.UCPoL.spring.mongo.api.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.UCPoL.spring.mongo.api.model.User;


public interface UserRepo extends MongoRepository<User, String> {

    User findByUsername(String username);

}