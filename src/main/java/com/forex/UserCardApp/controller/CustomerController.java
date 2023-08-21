package com.forex.UserCardApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.forex.UserCardApp.entity.Customer;
import com.forex.UserCardApp.service.CustomerService;





@RestController
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@GetMapping("/Customers/")
	public List<Customer> getAllUser(){
		return customerService.getAllCustomers();
	}
}
