package com.oops.basics;

public class Empmain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee("yash",13,200000);
//		employee.empName = "yash";
//		employee.empId = 20;
//		employee.salary = 1000000;
		employee.printDetail();
		
		
		employee.printDetail();
		String result = employee.greet("GreetName");
		
		System.out.println(result);
		

		Employee employee1 = new Employee("Priya",20,12000);
//		employee1.empName = "priya";
//		employee1.salary = 12000;
		employee1.printDetail();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Employee employee = new Employee();
//		System.out.println("Employee name " + employee.empName);
//		System.out.println("Employee empid " + employee.empId);
//		System.out.println("Employee salary " + employee.salary);

//		Employee employee1 = new Employee();
//		employee.empName = "priya";
//		employee.salary = 12000;

//		System.out.println("Employee name " + employee1.empName);
//		System.out.println("Employee1 empid " + employee1.empId);
//		System.out.println("Employee1 salary " + employee1.salary);

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

	}

}
