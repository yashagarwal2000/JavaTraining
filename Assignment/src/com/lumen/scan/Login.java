package com.lumen.scan;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] usernames = {"user1", "user2", "user3"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username to login: ");
        String input = scanner.nextLine();
        boolean found = false;
        for (String username : usernames) {
            if (input.equals(username)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("You are logged in successfully");
        } else {
            System.out.println("Invalid username");
        }
	}

}
