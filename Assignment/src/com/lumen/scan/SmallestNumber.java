package com.lumen.scan;

import java.util.Scanner;

public class SmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int smallest = (num1 < num2 && num1 < num3) ? num1 : (num2 < num3) ? num2 : num3;
        System.out.println("The smallest number is: " + smallest);
	}

}
