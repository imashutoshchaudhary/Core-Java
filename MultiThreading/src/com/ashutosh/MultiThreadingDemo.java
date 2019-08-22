package com.ashutosh;

class Hi extends Thread {
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

class Hello extends Thread {
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

public class MultiThreadingDemo {

	public static void main(String[] args) {
		
		Hi hi = new Hi();
		Hello hello = new Hello();
		
		hi.start();		// Thread start method always calls the run method first
		hello.start();

	}

}
