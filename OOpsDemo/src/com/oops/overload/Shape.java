package com.oops.overload;

public class Shape {
	void calcArea(int length) {
		System.out.println("sq "+(length*length));
	}
	int calcArea(int length,int breath) {
		return length*breath;
	}
	void clacArea(double radius) {
		System.out.println("Circle "+Math.PI*radius*radius);
	}
	double calcArea(double base,int height) {
		return (0.5*base*height);
	}
}
