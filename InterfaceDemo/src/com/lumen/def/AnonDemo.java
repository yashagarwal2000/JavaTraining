package com.lumen.def;

public class AnonDemo {
	public static void main(String[] args) {
		//implement bonus calculator using anonymous class
		BonusCalculator bonusCalculator = new BonusCalculator() {
			
			@Override
			public void calculator(int amount) {
				System.out.println("bonus are calculated");
				
			}
		};
		bonusCalculator.calculator(2500);
	}
	
}
