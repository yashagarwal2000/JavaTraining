package com.lumen.basics;

public class Greater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int greatestNumber = 0;
		int array[] = { 23, 45, 65, 43, 32 };
		for (int arr : array) {
			if (arr > greatestNumber)
				greatestNumber = arr;
		}
		System.out.println(greatestNumber);
	}

}
