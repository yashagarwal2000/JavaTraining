package com.oops.overload;

public class OverloadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape = new Shape();
		shape.calcArea(10);
		shape.calcArea((int)10.0);
		int rect = shape.calcArea(10, 20);
		System.out.println("Rect "+rect);
		double tri = shape.calcArea(12, 4);
		System.out.println("Tri "+tri);
		
	}

}
