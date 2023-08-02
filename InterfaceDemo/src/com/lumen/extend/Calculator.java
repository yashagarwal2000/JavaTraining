package com.lumen.extend;

public interface Calculator {
	void add(int x, int y);
	void product(int x, int y);
	
	
	default void differrence(double x,double y) {
		System.out.println(x-y);
	}
}
