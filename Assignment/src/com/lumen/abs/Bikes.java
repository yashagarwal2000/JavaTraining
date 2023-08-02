package com.lumen.abs;

public class Bikes extends Vehicle {

	public Bikes(String brand,String model,double price) {
		super(brand,model,price);
	}

	@Override
	void getMillage() {
		// TODO Auto-generated method stub
		System.out.println("bike millage");
	}

	@Override
	void showtype() {
		// TODO Auto-generated method stub
		System.out.println("Bike type is ");
		

	}
	void engineType() {
		System.out.println();
	}
}
