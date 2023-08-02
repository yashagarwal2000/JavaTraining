package com.oops.stat;

import static java.lang.Integer.parseInt;
import static com.oops.stat.Trial.*;

public class Demo {

	static {
		System.out.println("Staic block in demo");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Demo ");

//		Trial.getMessange();
//		System.out.println("Sum " + (Trial.x + Trial.y));
		getMessange();
		System.out.println("sum " + x+y);
		
//		using static import 
		final int n = parseInt("100");
		System.out.println(n);
		
	}

}
