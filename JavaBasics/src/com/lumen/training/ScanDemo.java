package com.lumen.training;

import java.util.Scanner;

public class ScanDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter details");
		System.out.println("enter name");
		String name = scanner.nextLine();
		System.out.println("Name " + name);
		System.out.println("enter id");
		int id = scanner.nextInt();
		System.out.println("Id " + id);
		scanner.nextLine();
		System.out.println("enter city");
		String city = scanner.nextLine();
		System.out.println("city " + city);
		System.out.println("enter salary");
		double salary = scanner.nextDouble();
		System.out.println("Salary " + salary);
		scanner.close();

	}

}
