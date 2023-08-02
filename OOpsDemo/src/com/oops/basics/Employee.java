package com.oops.basics;

public class Employee {

	String empName;
	int empId;
	double salary;
	
	Employee(String empName,int empId,double salary){
		this.empName = empName;
		this.empId = empId;
		this.salary = salary;
	}
	
	
	
	
	void printDetail() {
		System.out.println("Employee name " + empName);
		System.out.println("Employee empid " + empId);
		System.out.println("Employee salary " + salary);
		
		
	}
	String greet(String msg) {
		return msg + empName;
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Employee employee = new Employee();
//		System.out.println("Employee name " + employee.empName);
//		System.out.println("Employee empid " + employee.empId);
//		System.out.println("Employee salary " + employee.salary);
//
//		Employee employee1 = new Employee();
//		employee.empName = "priya";
//		employee.salary = 12000;
//
//		System.out.println("Employee name " + employee1.empName);
//		System.out.println("Employee1 empid " + employee1.empId);
//		System.out.println("Employee1 salary " + employee1.salary);
//
//		Employee employee2 = employee;
//		System.out.println("Employee2 name " + employee2.empName);
//		employee2.empName = "raj";
//		System.out.println("Employee2 name " + employee2.empName);
//		System.out.println("Employee name " + employee.empName);
//
////		make employee null
//		employee = null;
//		System.out.println("Employee2 name " + employee2.empName);
//		System.out.println("Employee name " + employee.empName);
//
//	}

}
