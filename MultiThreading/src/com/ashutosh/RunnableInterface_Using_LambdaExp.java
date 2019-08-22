package com.ashutosh;

public class RunnableInterface_Using_LambdaExp {

	public static void main(String[] args) throws Exception {
		
		Thread hii = new Thread(() -> {
			for (int i = 0; i <= 5; i++) {
				System.out.println("Hi");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		System.out.println(hii.isAlive());	// isAlive checks for Thread is running or not
		
		Thread helloo = new Thread(() -> {
			for (int i = 0; i <= 5; i++) {
				System.out.println("Hello");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		hii.setName("Hii Thread");
		helloo.setName("Hello Thread");
		System.out.println(hii.getName());
		System.out.println(helloo.getName());
		
		hii.setPriority(Thread.MIN_PRIORITY);
		helloo.setPriority(Thread.MAX_PRIORITY);
		System.out.println(hii.getPriority());
		System.out.println(helloo.getPriority());
		
		hii.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		helloo.start();
		
		hii.join();
		helloo.join();		// Join waits a thread to complete the prior thread
		
		System.out.println("Byee");

	}

}
