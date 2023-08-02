package com.lumen.basics;

public class SecondSmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int firstSmallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;

		for (int i = 0; i < array.length; i++) {
			if (array[i] < firstSmallest) {
				secondSmallest = firstSmallest;
				firstSmallest = array[i];
			} else if (array[i] < secondSmallest && array[i] != firstSmallest) {
				secondSmallest = array[i];

			}

		}
		System.out.println(secondSmallest);
	}

}
