package com.lumen.scan;

import java.util.Scanner;

public class ArraySquareRoots {

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
		double[] sqaureRoots = new double[size];
		for (int i = 0; i < size; i++) {
			sqaureRoots[i] = Math.sqrt(array[i]);
		}
		for (int i = 0; i < size; i++) {
			System.out.println("The sqrt of the number are "+sqaureRoots[i]);
		}
	}

}
