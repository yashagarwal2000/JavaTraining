package com.lumen.abs;

public abstract class Vehicle {
	String brand;
	String model;
	double price;
	
	public Vehicle(String brand, String model, double price) {

		this.brand = brand;
		this.model = model;
		this.price = price;
	}

	void printDetail() {
		System.out.println("model");
		System.out.println("brand");
		System.out.println("price");
	}

	abstract void getMillage();

	abstract void showtype();
}
