package com.barclays.loan.repository;


import org.springframework.data.repository.CrudRepository;

import com.barclays.loan.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer>{

	
}
