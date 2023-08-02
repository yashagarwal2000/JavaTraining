package com.lumen.basics;

public class PrimeNumber {
	
	public static void main(String[] args) {
		int check;
		int numberOfPrimeNumber = 100;
		// TODO Auto-generated method stub
		for (int i = 2; i < numberOfPrimeNumber; i++) {
			check = 0;
			for (int j = 2; j*j < i; j++) {
				if (i%j ==0) {
					check+=1;
					break;
				}
			}if(check == 0)System.out.print(" "+i);
		}
	}

}
