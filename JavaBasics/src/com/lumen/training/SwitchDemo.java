package com.lumen.training;

public class SwitchDemo {
	public static void main(String[] args) {
		
	

//	int x = 10;
//	int y = 20;
//	
//	switch(x+y) {
//	case 30:{
//		System.out.println("welcome");
//		break;
//	}
//	case 40:{
//		System.out.println("Hello");
//		break;
//	}
//	default:{
//		System.out.println("Great");
//	}
//	}
	String choice = "Monday";
	
	switch (choice) {
	
	case "Monday":
	case "Tuesday":
	case "Wednesday":
	case "Thurday":
	case "Friday":{
		System.out.println("Work day");
		break;
	}
	case "Saturday":{
		System.out.println("weekend");
		break;
	}
	case "Sunday":{
		System.out.println("restday");
	}
}
}
}
