package com.barclays.loan.repository;

import org.springframework.data.repository.CrudRepository;

import com.barclays.loan.entity.Loan;

public interface LoanRepository extends CrudRepository<Loan, Integer> {

}
