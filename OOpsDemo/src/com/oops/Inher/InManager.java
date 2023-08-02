package com.oops.Inher;

public class InManager extends InEmployee {

	double salary;
	
	public InManager(String name, int employeeId, double salary) {
		super(name, employeeId);
		// TODO Auto-generated constructor stub
		this.salary = salary;
	}
	void printBonus(double amount) {
		System.out.println(salary+amount);
	}

	
}
