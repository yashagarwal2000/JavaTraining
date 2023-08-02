package com.lumen.extend;

public class ScentificCalculator extends BasicCalculator implements Scentific {

	@Override
	public void square(int x) {
		// TODO Auto-generated method stub
		System.out.println(Math.pow(x, 2));
		
	}

	@Override
	public void cube(int x) {
		// TODO Auto-generated method stub
		System.out.println(Math.pow(x, 3));
	}

}
