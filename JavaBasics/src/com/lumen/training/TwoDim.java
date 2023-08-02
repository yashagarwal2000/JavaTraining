package com.lumen.training;

public class TwoDim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] marks = new int[3][2];
		System.out.println(marks.length);
		System.out.println(marks[0][0]);

//		populate
		marks[0][0] = 100;
		marks[0][1] = 100;
		marks[1][0] = 100;
		marks[1][1] = 200;
		marks[2][0] = 300;
		marks[2][1] = 100;
//		marks[3][0] = 100;
		
		int sum = 0;
		for (int one[] : marks) {
			for (int num : one) {
				System.out.println(num);
				sum+=num;
			}
		System.out.println(sum);
		}
	}

}
