package com.forex.UserCardApp.entity;

import java.time.LocalDateTime;
import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Customer")
public class Customer {
	@Id
	private Integer customerId;
	private String name;
	private String email;
	private String phoneNumber;
	private LocalDateTime dateOfBirth;
	private Long adhaarNumber;
	private Long panCardNumber;
	private String occupation;
	private Long annualIncome;
	private String paymentMode;
	@OneToOne(cascade = CascadeType.ALL)
	private Address permanentAddress;
	@OneToOne(cascade = CascadeType.ALL)
	private Address currentAddress;
	@OneToOne(cascade = CascadeType.ALL)
	private BankDetails bankDetails;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(Integer customerId, String name, String email, String phoneNumber, LocalDateTime dateOfBirth,
			Long adhaarNumber, Long panCardNumber, String occupation, Long annualIncome, String paymentMode
			,
			Address permanentAddress
			, Address currentAddress,BankDetails bankDetails
			) 
			{
		super();
		this.customerId = customerId;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.dateOfBirth = dateOfBirth;
		this.adhaarNumber = adhaarNumber;
		this.panCardNumber = panCardNumber;
		this.occupation = occupation;
		this.annualIncome = annualIncome;
		this.paymentMode = paymentMode;
		this.permanentAddress = permanentAddress;
		this.currentAddress = currentAddress;
		this.bankDetails = bankDetails;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public LocalDateTime getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDateTime dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Long getAdhaarNumber() {
		return adhaarNumber;
	}
	public void setAdhaarNumber(Long adhaarNumber) {
		this.adhaarNumber = adhaarNumber;
	}
	public Long getPanCardNumber() {
		return panCardNumber;
	}
	public void setPanCardNumber(Long panCardNumber) {
		this.panCardNumber = panCardNumber;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public Long getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(Long annualIncome) {
		this.annualIncome = annualIncome;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public Address getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress(Address permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	public Address getCurrentAddress() {
		return currentAddress;
	}
	public void setCurrentAddress(Address currentAddress) {
		this.currentAddress = currentAddress;
	}
	public BankDetails getBankDetails() {
		return bankDetails;
	}
	public void setBankDetails(BankDetails bankDetails) {
		this.bankDetails = bankDetails;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", email=" + email + ", phoneNumber="
				+ phoneNumber + ", dateOfBirth=" + dateOfBirth + ", adhaarNumber=" + adhaarNumber + ", panCardNumber="
				+ panCardNumber + ", occupation=" + occupation + ", annualIncome=" + annualIncome + ", paymentMode="
				+ paymentMode 
				+ ", permanentAddress=" + permanentAddress
				+ ", currentAddress=" + currentAddress
				+ ", bankDetails=" + bankDetails
				+ "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(adhaarNumber, email, phoneNumber);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(adhaarNumber, other.adhaarNumber) && Objects.equals(email, other.email)
				&& Objects.equals(phoneNumber, other.phoneNumber);
	}
	
	

}
