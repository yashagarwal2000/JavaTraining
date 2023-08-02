package com.lumen.extend;

public class MainCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calculator = new BasicCalculator();
		calculator.add(2, 3);
		calculator.product(2, 3);
		calculator.differrence(4, 2);
		
	
		Scentific scentific = new ScentificCalculator();
		scentific.add(3, 2);
		scentific.product(2, 3);
		scentific.square(3);
		scentific.cube(3);
}
}
