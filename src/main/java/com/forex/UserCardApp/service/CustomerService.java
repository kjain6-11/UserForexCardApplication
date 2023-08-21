package com.forex.UserCardApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.forex.UserCardApp.entity.Customer;
import com.forex.UserCardApp.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired(required=true)
	CustomerRepository customerRepository;

	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}

}
