package com.lumen.assignments;

import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String usernames[] = { "yash", "shiv", "jigyasa" };

		Scanner scanner = new Scanner(System.in);
		String uname = scanner.nextLine();
		int count = 0;
		for (String name : usernames) {
			if (uname.equals(name)) {
				System.out.println("Name exist");
				count = 1;
				break;
			}
		if (count == 0)
			System.out.println("you are register");
			{
			}
		}
	}
}
