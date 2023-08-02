package com.lumen.custom;

public class CustomeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("in CustomeBank");
		CustomBank customBank = new CustomBank(20000);
		try {
			customBank.withdraw(100);
		} catch (Exception e) {
			System.out.println("Limit exceed");
			System.out.println(e.getMessage());
		}
	}

}
