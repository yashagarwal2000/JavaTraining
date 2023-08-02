package com.lumen.scan;

import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] userNames = { "Yash", "Shivam", "saba" };
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the username for the login ");
		String name = scanner.nextLine();
		boolean isUnique = true;
		for (String userName : userNames) {
			if (userNames.equals(name)) {
				isUnique = false;
				break;
			}
		}

		if (isUnique) {
			System.out.println("You are registered");
		} else {
			System.out.println("Name is not unique");
		}
	}

}
