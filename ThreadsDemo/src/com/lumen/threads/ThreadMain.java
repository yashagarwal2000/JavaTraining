package com.lumen.threads;

public class ThreadMain {

	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		System.out.println(thread);
//		int[]nums = null;
//		System.out.println(nums[0]);
		
		thread.setName("poppy");
		thread.setPriority(Thread.MAX_PRIORITY);
		System.out.println(thread);
		int [] nums = null;
		System.out.println(nums[0]);
	}

}
