package com.lumen.fun;

public class ProcessMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Processor processor = new Processor();
//		
		processor.processData((x,y)->{
			System.out.println(x+y);
		}, 10, 20);
		processor.processData((x,y)->{
			System.out.println(x-y);
		}, 10, 5);
		
	
		processor.processData(new NewCalculator() {
			
			@Override
			public void calculate(int x, int y) {
				System.out.println(x*y);
			}
		}, 12, 3);
		
	
	}
}