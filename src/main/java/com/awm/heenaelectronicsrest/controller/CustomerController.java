package com.awm.heenaelectronicsrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.awm.heenaelectronicsrest.model.Customer;
import com.awm.heenaelectronicsrest.model.History;
import com.awm.heenaelectronicsrest.service.ICustomerService;

@RestController
@RequestMapping("/customer")
@CrossOrigin(origins = { "http://localhost:4200" })
public class CustomerController {

	@Autowired
	ICustomerService customerService;

	@PostMapping("/create")
	public void create(@RequestBody Customer customer) {
		customerService.create(customer);
	}

	@PutMapping("/update")
	public void update(@RequestBody Customer customer) {
		customerService.create(customer);
	}
	
	@GetMapping("/all")
	public List<Customer> getAllCustomer() {
		return customerService.getAllCustomer();
	}

	@DeleteMapping("/delete/{id}")
	public void deleteCustomerById(@PathVariable String id) {
		customerService.delete(id);
	}
	
	@PostMapping("/history/all")
	public List<History> getAllHistoryByID(@RequestBody String cardNumber) {
		return customerService.getAllHistoryByID(cardNumber);
	}
}
