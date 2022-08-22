package com.barclays.loan.exception;

public class UnknownLoanStatusEnumValueException extends Exception {

	private static final long serialVersionUID = 1L;

	public UnknownLoanStatusEnumValueException(String message) {
		super(message);
	}

}
