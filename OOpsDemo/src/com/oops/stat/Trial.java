package com.oops.stat;

public class Trial {
	
	static int x;
	static int y=10;
	
	static {
		System.out.println("In ststic bloeck");
		x = 200;
	}
	static void  getMessange() {
		System.out.println("in static methord");
		System.out.println("Sum "+(x+y));
	}
	public static void main(String[] args) {
		System.out.println("in main");
		getMessange();
		System.out.println("Sum "+(x+y));
	}
}
