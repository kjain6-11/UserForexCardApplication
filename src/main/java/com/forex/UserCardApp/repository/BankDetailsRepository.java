package com.forex.UserCardApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.forex.UserCardApp.entity.BankDetails;



public interface BankDetailsRepository extends JpaRepository<BankDetails, Long> {

}
