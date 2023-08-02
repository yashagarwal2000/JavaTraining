package com.oops.Inher;

public class Mobile extends Electronic {
	String cameratype;

	public Mobile(String brand, String model, double price, String cameratype) {
		super(brand, model, price);
		this.cameratype = cameratype;
	}
	void showCameraType() {
		System.out.println(cameratype);
	}

}
