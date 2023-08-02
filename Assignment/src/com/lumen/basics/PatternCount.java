package com.lumen.basics;

public class PatternCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =1;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(count);
				count++;
				if (count>9) break;
			}
			System.out.println();
		}
	}

}
