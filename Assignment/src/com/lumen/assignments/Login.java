package com.lumen.assignments;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String usernames[] = { "yash", "shiv", "jigyasa" };

		System.out.println("Enter the username ");
		Scanner scanner = new Scanner(System.in);

		String name = scanner.next();
		boolean flag = true;
		for (String username : usernames) {
			if (name.equals(username)) {
				System.out.println("Login Successful");
			flag = false;
			break;
			}
		}
		if (flag)
			System.out.println("Invalid userid");
		scanner.close();
	}
}