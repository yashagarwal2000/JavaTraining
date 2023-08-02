package com.lumen.basics;

import java.util.Scanner;

public class PalidromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the numner to check the palidrome : ");
		int number = scanner.nextInt();
		int reverseNumber = 0;
		int tempNumber = number;
		while (number != 0) {
			int digit = number%10;
			reverseNumber = reverseNumber+digit;
			number /= 10;
		}
		if(tempNumber == reverseNumber)System.out.println(tempNumber+" is a palidrome number");
		else {
			System.out.println(tempNumber+" The number is not the palidrome number");
		}
	}

}
