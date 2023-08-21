package com.forex.UserCardApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.forex.UserCardApp.entity.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
