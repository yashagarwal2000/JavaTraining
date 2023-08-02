package com.lumen.overloading;

public class OverloadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee("Yash", "Manager");
		Employee employee1 = new Employee("Shivam", "Programmer");
		Employee employee2 = new Employee("Agarwal", "Director");
		
		double basicAllowance = 10000;
		double carAllowance = 2000;
		double houseAllowance = 4000;
		
		System.out.println(employee.calcBonus(basicAllowance));
		System.out.println(employee1.calcBonus(basicAllowance, carAllowance));
		System.out.println(employee2.calcBonus(basicAllowance, carAllowance, houseAllowance));
	}

}
