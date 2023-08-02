package com.lumen.fun;

public class LmdaDemo {
	public static void main(String[] args) {
//		implemention
		Greeter greeter = (String username)->{
			System.out.println("Hello "+ username);
		};
//		calling the methord
		greeter.greetuser("yash");
		
		Greeter greeter2 = username->System.out.println("welcome "+username);
		greeter2.greetuser("shivam");
	}
}
