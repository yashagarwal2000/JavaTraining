package com.lumen.def;

public interface BonusCalculator {
	void calculator(int amount);
	default void greet() {
		System.out.println("Have a great day");
	}
	default void policytype() {
		System.out.println("Healty policy");
	}
	static void call() {
		System.out.println("Calling for lunch");
	}
}
