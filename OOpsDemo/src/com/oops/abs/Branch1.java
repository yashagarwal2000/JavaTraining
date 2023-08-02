package com.oops.abs;

public class Branch1 extends Bank {

	@Override
	void carLone() {
		// TODO Auto-generated method stub
		System.out.println("Apply for car lone");
	}

	@Override
	void homeLone() {
		// TODO Auto-generated method stub
		System.out.println("Apply for home lone");
	}

	@Override
	void educationLone() {
		// TODO Auto-generated method stub
		System.out.println("Apply for education lone ");
		
	}

	void getPay() {
		System.out.println("get the payment for the bank");
	}

	@Override
	void admin() {
		System.out.println("in branch1 admin");
	}

}
