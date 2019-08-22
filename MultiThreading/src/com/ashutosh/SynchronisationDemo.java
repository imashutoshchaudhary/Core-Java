package com.ashutosh;

class Counter {
	int count = 0;
	public synchronized void increment() {	// Synchronized makes class Thread Safe : Threads can
		count++;							// access class at the same time
	}
}
public class SynchronisationDemo {

	public static void main(String[] args) throws Exception {
		
		Counter c = new Counter();

		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 1000; i++) {
					c.increment();
				}
			}
		});
		
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 1000; i++) {
					c.increment();
				}
			}
		});
		
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		
		System.out.println("Counter is in "+c.count);

	}

}
