package com.lumen.exceptions;

public class Atm {

	public static void main(String[] args) {
		System.out.println("In ATM");
		Bank bank = new Bank(8000);
		try {
			bank.withdraw(2000);
			System.out.println("Amount withdraw");
		} catch (Exception e) {
			System.out.println("try again");
			System.out.println(e.getMessage());
		}

	}

}
