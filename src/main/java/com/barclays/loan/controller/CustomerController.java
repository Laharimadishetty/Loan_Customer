package com.barclays.loan.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.barclays.loan.constants.ApiMapping;
import com.barclays.loan.dto.LoanDTO;
import com.barclays.loan.exception.BarclaysBankException;
import com.barclays.loan.service.CustomerLoanService;


@RestController
@RequestMapping(ApiMapping.CUSTOMER_CONTROLLER_ROOT)

public class CustomerController {
	
	@Autowired
	CustomerLoanService customerLoanService;
	
	@PostMapping(ApiMapping.SANCATION_NEW_LOAN)
	public ResponseEntity<Integer> sanctionLoanToExistingCustomer(@PathVariable Integer customerId, @RequestBody LoanDTO loanDTO) throws BarclaysBankException {
		return new ResponseEntity<>(customerLoanService.sanctionLoanToExistingCustomer(customerId, loanDTO), HttpStatus.OK);
	}

}
