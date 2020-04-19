package com.awm.heenaelectronicsrest.service;

import java.util.List;

import com.awm.heenaelectronicsrest.model.Customer;
import com.awm.heenaelectronicsrest.model.History;

public interface ICustomerService extends IBaseService<Customer> {

	public List<Customer> getAllCustomer();
	
	public List<History> getAllHistoryByID(String id);
}
