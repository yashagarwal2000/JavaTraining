package com.lumen.training;

public class Terminary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int x = 101;
//		String result = x>100?"Hello":"Welcome";
//		System.out.println(result);
		
		int x = 10;
		int y = 20;
		int z = 30;
		String result = (x>y && x>z)?"X is greater":(y>z)?"Y is greater":"Z is greater";
		System.out.println(result);
	}

}
