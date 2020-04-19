package com.awm.heenaelectronicsrest.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.awm.heenaelectronicsrest.model.User;

@Repository
public interface IUserRepository extends MongoRepository<User, String> {
	User findUserByEmailAndPassword(String email, String password);
}
