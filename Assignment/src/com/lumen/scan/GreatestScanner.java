package com.lumen.scan;

import java.util.Scanner;

public class GreatestScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter three number : ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int greatest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
		System.out.println(greatest);
		scanner.close();
	}

}
