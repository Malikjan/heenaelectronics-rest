package com.awm.heenaelectronicsrest.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.awm.heenaelectronicsrest.model.Customer;

@Repository
public interface ICustomerRepository extends MongoRepository<Customer, String> {

	@Query("{_id :?0}")
	Customer findCustomerById(String id);
}
