package com.lumen.basics;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int factorialNumber = 6;
		int fatctorial = 1;
		if (factorialNumber == 0)
			fatctorial = 1;
		else {
			for (int i = 1; i <= factorialNumber; i++) {
				fatctorial *= i;
			}
		}
		System.out.println(fatctorial);
	}

}
