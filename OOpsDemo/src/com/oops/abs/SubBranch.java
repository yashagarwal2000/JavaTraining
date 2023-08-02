package com.oops.abs;

public class SubBranch extends Branch2 {

	@Override
	void carLone() {
		// TODO Auto-generated method stub
		System.out.println("Carloan is in subbranch");
		super.homeLone();
	}
	void subPay() {
		System.out.println("Payment in subbranch ");
	}
	void loneType() {
		System.out.println("we have all type of loan ");
	}

}
