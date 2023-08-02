package com.oops.basics;

import java.util.Scanner;

enum Seasons{
	SUMMER,WINTER,RAINY,AUTUMN
	
}
public class EnumSwitch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String choice = scanner.next().toUpperCase();
		
//		string to enum
		Seasons seasons = Seasons.valueOf(choice);
		
		
		switch (seasons) {
		case SUMMER: {
			System.out.println("very hot eat iceCream");
//			yield type;
			break;
		}
		case WINTER: {
			System.out.println("very COLD");
//			yield type;
			break;
		}
		case RAINY: {
			System.out.println("very RAIN");
//			yield type;
			break;
		}
		case AUTUMN: {
			System.out.println("MEDIUM");
//			yield type;
			break;
		}
		default:
//			System.out.println("PLEASE SELECT THE CORRECT SESSION");
			throw new IllegalArgumentException("Unexpected value: " + seasons);
		}
		
	}
}
