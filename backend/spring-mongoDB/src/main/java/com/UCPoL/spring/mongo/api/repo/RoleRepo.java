package com.UCPoL.spring.mongo.api.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.UCPoL.spring.mongo.api.model.Role;


public interface RoleRepo extends MongoRepository<Role, String> {

    Role findByRole(String role);
}
