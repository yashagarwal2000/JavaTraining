package com.oops.Inher;

public class Laptop extends Electronic {

	String[] ports;

	public Laptop(String brand, String model, double price, String[] ports) {
		super(brand, model, price);
		this.ports = ports;

	}

	void showport() {
		for (String port : ports) {
			System.out.println(port);
		}
		
	}
}
