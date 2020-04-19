package com.awm.heenaelectronicsrest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.awm.heenaelectronicsrest.model.Customer;
import com.awm.heenaelectronicsrest.model.User;

@Service
public interface IUserService extends IBaseService<Customer> {

	public User checkCurrentUser(User user);
	
	public List<User> getAllUser();
}
