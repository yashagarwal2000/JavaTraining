package com.lumen.objbasics;

public class Student {
	String name;
	String department;
	public Student(String name, String department) {
//		super();
		this.name = name;
		this.department = department;
	}
	void printDetail() {
		System.out.println("Name : "+name);
		System.out.println("Department : "+department);
	}
	String getGrades(int...marks) {
		int sum = 0;
		for (int mark : marks) {
			sum += mark;
		}
		
		double average = (double)sum/marks.length;
		if(average>=90)return "A";
		else if (average>=80)return "B";
		else if (average>=70)return "C";
		else if (average>=60)return "D";
		else if (average>=50)return "E";
		else {
			return "Fail";
		}
	}
	
}
