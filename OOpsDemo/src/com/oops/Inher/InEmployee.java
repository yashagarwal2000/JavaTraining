package com.oops.Inher;

public class InEmployee {
	
	String name;
	int employeeId;
	
	public InEmployee(String name, int employeeId) {
		super();
		this.name = name;
		this.employeeId = employeeId;
	}

	void print() {
		System.out.println(name);
		System.out.println(employeeId);
	}
	

}
