package com.barclays.loan.dto;

import java.time.LocalDate;

import com.barclays.loan.entity.Loan;
import com.barclays.loan.utils.LoanStatus;


public class LoanDTO {
	
	Integer loanId;
	Double amount;
	LocalDate date;
	CustomerDTO customer;
	LoanStatus status;
	
	public LoanDTO() {
	}
	
	public LoanDTO(Loan loan, CustomerDTO customerDTO) {
		this.loanId = loan.getLoanId();
		this.amount = loan.getAmount();
		this.date = loan.getDate();
		this.customer = customerDTO;
		this.status = loan.getStatus();
	}
	public Loan toLoanEntity() {
		Loan loan = new Loan();
		loan.setLoanId(loanId);
		loan.setAmount(amount);
		loan.setDate(date);
		loan.setStatus(status);
		
		return loan;
	}
	
	public Integer getLoanId() {
		return loanId;
	}
	
	public void setLoanId(Integer loadId) {
		this.loanId = loadId;
	}
	
	public Double getAmount() {
		return amount;
	}
	
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	public LocalDate getDate() {
		return date;
	}
	
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	public CustomerDTO getCustomer() {
		return customer;
	}
	public void setCustomer(CustomerDTO customer) {
		this.customer = customer;
	}
	
	public LoanStatus getStatus() {
		return status;
	}
	
	public void setStatus(LoanStatus status) {
		this.status = status;
	}
	

}
