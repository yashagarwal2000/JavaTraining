package com.lumen.basics;

public class DigitSumAug {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array = {1,2,3,4,5,6,7,8,9};
		int sum = 0;
		for (int element : array) {
			sum += element;
		}
		System.out.println(sum);
		System.out.println("the average is "+ sum/array.length);
	}
}
