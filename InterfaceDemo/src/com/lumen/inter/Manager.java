package com.lumen.inter;

public class Manager extends Employee implements IEnterinment {
	double amount;

	public Manager(String employeeName, String employeeId, double salary, double amount) {
		super(employeeName, employeeId, salary);
		this.amount = amount;
	}
	// TODO Auto-generated constructor stub

	@Override
	public void vechileInsurance() {
		// TODO Auto-generated method stub
		System.out.println("vechile Insurance ");
	}

	@Override
	public void healthInsurance() {
		// TODO Auto-generated method stub
		System.out.println("Health Insurance ");

	}

	@Override
	public void showTrips() {
		// TODO Auto-generated method stub

	}

	@Override
	String showCourses() {
		// TODO Auto-generated method stub
		return null;
	}

	void calBonus() {
		System.out.println("Manager get bonus");
	}
}
