package com.oops.overload;

public class VarargsDemo {
	void calcSum(String name,int...marks) {
		System.out.println("Welcome "+ name);
		int sum = 0;
		for (int mark : marks) {
			sum+= mark;
			
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VarargsDemo demo = new VarargsDemo();
		demo.calcSum("sri",90,80,90);
		demo.calcSum("Yash", 90,70,40,70,90);
		
	}

}
