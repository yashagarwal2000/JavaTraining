package com.lumen.fun;

public class CalcMain {

	public static void main(String[] args) {
		NewCalculator addition = (x,y)-> System.out.println(x+y);
		addition.calculate(10, 3);
		NewCalculator substration = (x,y)-> System.out.println(x-y);
		substration.calculate(10, 7);
		NewCalculator multiplication = (x,y)-> System.out.println(x*y);
		multiplication.calculate(10, 3);
		
		Printer  printer= ()-> "Welcome back";
		System.out.println(printer.print());
	}

}
