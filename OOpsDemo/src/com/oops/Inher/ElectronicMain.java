package com.oops.Inher;

public class ElectronicMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile myPhone = new Mobile("14-pro", "Apple", 1500000, "rear");
		myPhone.showCameraType();
		String[] ports = { "hdmi", "vgi", "usb-3" };
		Laptop Mylaptop = new Laptop("apple", "hp", 12000, ports);
		Mylaptop.showport();
	}
}
