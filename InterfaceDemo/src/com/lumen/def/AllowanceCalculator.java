package com.lumen.def;

public interface AllowanceCalculator {
	void calulate(int amount);
	default void PolicyType(){
		System.out.println("Policy of the allowance");
		
	}
}
