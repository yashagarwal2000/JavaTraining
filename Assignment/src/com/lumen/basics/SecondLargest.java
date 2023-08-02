package com.lumen.basics;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		
		int firstLargest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for (int i = 0; i < array.length; i++) {
			if(array[i]>firstLargest) {
				secondLargest = firstLargest;
				firstLargest=array[i];
			}
			else if(array[i]>secondLargest && array[i] != firstLargest) {
				secondLargest = array[i];
			}
		}
		System.out.println(secondLargest);
	}
}
