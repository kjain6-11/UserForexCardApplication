package com.forex.UserCardApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.forex.UserCardApp.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
