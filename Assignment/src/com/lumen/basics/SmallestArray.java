package com.lumen.basics;

public class SmallestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int smallestNumber = Integer.MAX_VALUE;
		int array[] = { 23, 45, 65, 43, 32 };
		for (int arr : array) {
			if (arr < smallestNumber)
				smallestNumber = arr;
		}
		System.out.println(smallestNumber);
	}

}
