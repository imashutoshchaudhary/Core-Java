package com.ashutosh;

class Hii implements Runnable {
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Helloo implements Runnable {
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class RunnableInterface {

	public static void main(String[] args) {
		
		Hi hi = new Hi();
		Hello hello = new Hello();
		
		Thread hii = new Thread(hi);
		Thread helloo = new Thread(hello);
		
		hii.start();
		helloo.start();
	}

}
