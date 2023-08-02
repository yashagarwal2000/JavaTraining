package com.oops.overload;

public class Vehicle {
	String model;
	String brand;
	double price;

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub

	}

	public Vehicle(String model) {
		this();
		this.model = model;
		System.out.println("One param " + model);
	}

	public Vehicle(String model, double price) {

		this(model);
		this.price = price;
		System.out.println("Two param " + model + price);
	}

	public Vehicle(String model, String brand, double price) {

		this(model, price);
		this.brand = brand;
		System.out.println("Three param " + model + price + brand);
	}

	void print() {
		if (model != null)
			System.out.println("Model " + model);

		if (brand != null)
			System.out.println("brand " + brand);
		if (price > 0)
			System.out.println("price " + price);
	}

}
