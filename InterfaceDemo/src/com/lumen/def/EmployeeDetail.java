package com.lumen.def;

public class EmployeeDetail implements BonusCalculator,AllowanceCalculator {

	@Override
	public void calculator(int amount) {
		System.out.println(amount * 5);
	}

	@Override
	public void greet() {
		// TODO Auto-generated method stub
		BonusCalculator.super.greet();
	}

	@Override
	public void calulate(int amount) {
		// TODO Auto-generated method stub
		
	}
	
}
