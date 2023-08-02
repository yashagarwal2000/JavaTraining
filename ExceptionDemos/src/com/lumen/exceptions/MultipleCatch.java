package com.lumen.exceptions;

public class MultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Welcome");
			String value = args[0];
			System.out.println("Value "+value);
			int num = Integer.parseInt(value);
			System.out.println("Number "+ num);
			int result = 100/num;
			System.out.println(result);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println("Done with 0");
		}catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("Done with 0");
		}
	}

}
