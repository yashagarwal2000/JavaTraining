package com.oops.override;

public class Triangle extends Shaper{

	@Override
	void area(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Area of triangle "+ 0.5*x*y);
	}

	@Override
	void greet() {
		// TODO Auto-generated method stub
		System.out.println("User WELCOME");
	}
	
}
