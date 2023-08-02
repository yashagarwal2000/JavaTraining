package com.lumen.basics;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 123;
		int numCopy = num;
		int sum = 0;
		int mod;
		while (num > 0) {
			mod = num % 10;
			sum += mod;
			num /= 10;
		}

		if (numCopy == sum)
			System.out.println("The number is perfect number");
		else {
			System.out.println("The number is not perfect number");
		}

	}

}
