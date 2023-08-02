package com.lumen.threads;

class Child extends Thread {
	public Child(String name,  int priority) {
		super(name);
		this.setPriority(priority);
		System.out.println(this);
		this.start();
	}

	@Override
	public void run() {
		String tname = Thread.currentThread().getName();
		for (int i = 0; i < 5; i++) {
			System.out.println(tname + "" + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

public class ExtendThread {
	public static void main(String[] args) {
//		Child child1 = new Child();
//		child1.setName("Yash");
//		child1.setPriority(Thread.MAX_PRIORITY);
		Thread child1 = new Child("A",Thread.MAX_PRIORITY);

//		Child child2 = new Child();
//		child2.setName("Poppy");
//		child2.setPriority(Thread.MIN_PRIORITY + 3);
		Thread child2 = new Child("B",Thread.MIN_PRIORITY);
		
//		Child child3 = new Child();
//		child3.setName("Venky");
//		child3.setPriority(Thread.NORM_PRIORITY + 2);
		Thread child3 = new Child("C",Thread.NORM_PRIORITY);
		
//		child1.start();
//		child2.start();
//		child3.start();

	}
}