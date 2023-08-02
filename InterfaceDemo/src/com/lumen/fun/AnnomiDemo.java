package com.lumen.fun;

public class AnnomiDemo {

	public static void main(String[] args) {
		Greeter greeter = new GreetImpl(); 
		greeter.greetuser("Yash");
		
//		anonymous class
		Greeter greeter2 = new Greeter() {
			
			@Override
			public void greetuser(String username) {
				System.out.println("Greet day " + username);
			}
		};
		
//		calling
		greeter2.greetuser("Yash");
		Greeter greeter3 = new Greeter() {
			
			@Override
			public void greetuser(String username) {
				System.out.println("Welcome "+username);
				
			}
		};
		greeter3.greetuser("Shivam");
		
		
	}

}
