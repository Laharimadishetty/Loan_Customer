package com.barclays.loan.service;

import com.barclays.loan.dto.LoanDTO;
import com.barclays.loan.exception.BarclaysBankException;


public interface CustomerLoanService {
	
	public LoanDTO getLoanDetails(Integer loanId) throws BarclaysBankException;
	public Integer addLoanAndCustomer(LoanDTO loanDTO) throws BarclaysBankException;
	public Integer sanctionLoanToExistingCustomer(Integer customerId,LoanDTO loanDTO) throws BarclaysBankException;
	public void deleteLoan(Integer loanId) throws BarclaysBankException;
	public void closeLoan(Integer loanId) throws BarclaysBankException;

}
