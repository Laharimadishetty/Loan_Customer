package com.barclays.loan.dto;


import java.time.LocalDate;

import com.barclays.loan.entity.Customer;

public class CustomerDTO {
	
	Integer customerId;
	String emailid;
	String name;
	LocalDate dateOfBirth;
	
	public CustomerDTO() {
	}

	public CustomerDTO(Customer customer) {
		this.customerId = customer.getCustomerId();
		this.emailid = customer.getEmailid();
		this.name = customer.getName();
		this.dateOfBirth = customer.getDateOfBirth();
	}
	
	public Customer toCustomerEntity() {
		Customer customer = new Customer();
		
		customer.setCustomerId(customerId);
		customer.setEmailid(emailid);
		customer.setName(name);
		customer.setDateOfBirth(dateOfBirth);
		
		return customer;
	}
	
	public Integer getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	
	public String getEmailid() {
		return emailid;
	}
	
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}
