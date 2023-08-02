package com.lumen.inter;

public  abstract class Employee implements IInsurance {
	String employeeName;
	String employeeId;
	double salary;
	public Employee(String employeeName, String employeeId, double salary) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.salary = salary;
	}
	abstract String showCourses();

}