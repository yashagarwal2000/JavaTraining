package com.lumen.threads;

public class Booking {
	public double bookTickets(String name,int noOfTicket) {
		double costPerTicket = 200;
		System.out.println("Booked for : "+name);
		double totalNoTickects = costPerTicket*noOfTicket;
		return totalNoTickects;
		
//		System.out.println("total : "+to);
	}
	


}
