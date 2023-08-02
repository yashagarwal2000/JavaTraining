package com.lumen.exceptions;

public class MultiCatch {

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
			int[] nums = null;
			System.out.println(nums[0]);
		}catch (ArrayIndexOutOfBoundsException | NumberFormatException | ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("Plese enter the number");
			
			
		}catch (RuntimeException e) {
			System.out.println(e.getMessage());
//			System.out.println("Done with 0");
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Completed");
	}

}
