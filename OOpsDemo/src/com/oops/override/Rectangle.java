package com.oops.override;

public class Rectangle extends Shaper{

	@Override
	void area(int x, int y) {
		// TODO Auto-generated method stub
//		super.area(x, y);
		System.out.println("Area of rectangle "+ x*y);
		
		
	}

	@Override
	void greet() {
		System.out.println("Welcome user");
	}

}
