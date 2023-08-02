package com.oops.overload;

public class VehicleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle = new Vehicle();
		vehicle.print();
		System.out.println();
		vehicle = new Vehicle("A100");
		vehicle.print();
		System.out.println();
		vehicle = new Vehicle("A200",120000);
		vehicle.print();
		
	}

}
