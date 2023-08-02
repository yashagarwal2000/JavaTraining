package com.lumen.api;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee employee = new Employee("Raj",10,3000);
		System.out.println(employee);
		
		
		int x = 10;
		long y = x; //upcasting
		Long a = y; //autoboxing
		
		int b = (int)y; //downcasting
//		convert into the object
		Object o = a; //this is a type Long
		
//		tying to downcast it will show class casting exception
		Integer i = (Integer)o; //exception
	}
}
