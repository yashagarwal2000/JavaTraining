package com.lumen.scan;

import java.util.Scanner;

public class ArraySumAndAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = scanner.nextInt();
		int[] array = new int[size];
		
		System.out.println("Enter The value in an array");
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
			
		}
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		double average = sum/size;
		
		System.out.println("The sum of element in the array is "+ sum);
		System.out.println("The average of element in the array is "+average);
	}

}
