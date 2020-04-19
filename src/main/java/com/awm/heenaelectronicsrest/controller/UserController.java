package com.awm.heenaelectronicsrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.awm.heenaelectronicsrest.model.User;
import com.awm.heenaelectronicsrest.service.IUserService;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = { "http://localhost:4200" })
public class UserController {

	@Autowired
	IUserService userService;

	@PostMapping("/current")
	public User checkCurrentUser(@RequestBody User user) {
		return userService.checkCurrentUser(user);
	}
	
	@GetMapping("/all")
	public List<User> getAllUser() {
		return userService.getAllUser();
	}
}
