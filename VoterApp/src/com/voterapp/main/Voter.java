package com.voterapp.main;

import java.util.Scanner;

import com.voterapp.exception.InValidVoterException;
import com.voterapp.service.ElectionBootImpl;

public class Voter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Plese enter the age : ");
		int age = scanner.nextInt();
		System.out.println("enter the locality");
		String locality = scanner.next();
		System.out.println("Plese enter the voter id number : ");
		int voterID = scanner.nextInt();

		ElectionBootImpl electionBootImpl = new ElectionBootImpl();
		try {
			if (electionBootImpl.checkEligibilty(age, locality, voterID))
				System.out.println("You are eligible to vote!");
		} catch (InValidVoterException e) {
		}
	}

}
