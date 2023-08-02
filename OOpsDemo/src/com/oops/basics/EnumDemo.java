package com.oops.basics;

enum Weekdays{
	MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}

public class EnumDemo {
	public static void main(String[] args) {
		Weekdays weekday = Weekdays.FRIDAY;
		
		System.out.println(weekday.FRIDAY);
//		convert enumm to string
		System.out.println(weekday.name());
//		to get index(ordinal)from enum
		System.out.println(weekday.ordinal());
//		static methord so call in static way
		Weekdays[] weekdayArr = weekday.values();
		
		for (Weekdays weekdays : weekdayArr) {
			System.out.println(weekday.name());
		}
		System.out.println("convert string to enum constant");
		weekday = Weekdays.valueOf("MONDAY");
		System.out.println(weekday);
	}

}
