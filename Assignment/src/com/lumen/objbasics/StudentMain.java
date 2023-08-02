package com.lumen.objbasics;

public class StudentMain {

	public static void main(String[] args) {
		Student student = new Student("yash","cse");
		int[] array = {80,80,50,60,95};
		
		student.printDetail();
		System.out.println("Grade received : "+student.getGrades(array));
		
		Student student1 = new Student("Shivam", "cse");
		 int[] array1 = {30,50,60,70,85};
		 student1.printDetail();
		 System.out.println("Grade received : "+student1.getGrades(array1));
		 
		
	}
	
	

}
