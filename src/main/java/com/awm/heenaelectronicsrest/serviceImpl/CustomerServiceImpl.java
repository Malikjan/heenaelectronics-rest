package com.awm.heenaelectronicsrest.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.awm.heenaelectronicsrest.model.Customer;
import com.awm.heenaelectronicsrest.model.History;
import com.awm.heenaelectronicsrest.repository.ICustomerRepository;
import com.awm.heenaelectronicsrest.service.ICustomerService;

@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	ICustomerRepository customerRepository;

	@Override
	public void update(Customer t) {
		// TODO Auto-generated method stub
	}

	@Override
	public void create(Customer customer) {
		customer.setElectronicCard(customer.getElectronicCard());
		System.out.println(customer.getHistory().getAddPoint());
		customer.setHistory(customer.getHistory());
		customerRepository.save(customer);
	}

	@Override
	public void delete(String id) {
		customerRepository.deleteById(id);
	}

	@Override
	public List<Customer> getAllCustomer() {
		return customerRepository.findAll(Sort.by(Sort.Direction.DESC, "id"));
	}

	@Override
	public List<History> getAllHistoryByID(String id) {
		System.out.println(id);
		Customer customer = customerRepository.findCustomerById(id);
		System.out.println(customer.getAddress());
		System.out.println(customer.getHistory().getCreatedDate());
		// List<History> allHistory = customer.getAllHistory();
		// Iterator<History> history = allHistory.iterator();
		// while (history.hasNext() && history != null)
		// System.out.println(history.next());
		List<History> allHistory = new ArrayList<History>();
		allHistory.add(customer.getHistory());

		return allHistory;
	}
}
