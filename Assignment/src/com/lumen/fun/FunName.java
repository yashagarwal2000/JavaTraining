package com.lumen.fun;

public class FunName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory shapeFactory = new ShapeFactory();
		shapeFactory.printArea((x,y)->{
			System.out.println(x*y); 
			return x*y;
		}, 20, 30);
}
}
