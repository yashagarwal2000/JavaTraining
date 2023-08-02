package com.lumen.custom;

public class ExtendingLimitException extends Exception {

	public ExtendingLimitException() {
		super();
		System.out.println("limit exception");
	}

	public ExtendingLimitException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
