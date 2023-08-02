package com.oops.basics;

enum VehicleDetails {
	HONDA("CITY", 900000), AUDI("A10", 500000), MAHINDRA("THAR", 40000), BMW("BMW90", 35000);

	private String brand;
	private double price;

	private VehicleDetails(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public double getPrice() {
		return price;

	}
}
	public class EnumConstrDemo {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			VehicleDetails vehicle = VehicleDetails.AUDI;
			System.out.println("Model " + vehicle.getBrand());
			System.out.println("Model " + vehicle.getPrice());

			String mpdelOfHonda = VehicleDetails.HONDA.getBrand();
			double priceOfHond = VehicleDetails.HONDA.getPrice();
			
			System.out.println(mpdelOfHonda);
			System.out.println(priceOfHond);
		}

}
