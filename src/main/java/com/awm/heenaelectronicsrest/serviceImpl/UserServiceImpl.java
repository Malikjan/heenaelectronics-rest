package com.awm.heenaelectronicsrest.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.awm.heenaelectronicsrest.model.Customer;
import com.awm.heenaelectronicsrest.model.User;
import com.awm.heenaelectronicsrest.repository.IUserRepository;
import com.awm.heenaelectronicsrest.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	IUserRepository userRepository;

	@Override
	public User checkCurrentUser(User user) {
		return userRepository.findUserByEmailAndPassword(user.getEmail(), user.getPassword());
	}

	@Override
	public List<User> getAllUser() {
		return userRepository.findAll();
	}

	@Override
	public void update(Customer t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void create(Customer t) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub

	}
}
