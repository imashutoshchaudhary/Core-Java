package com.ashutosh;

class Outer {         //Class file name will be Outer.class
	
	static int a;
	
	public static void show() {
		
	}
	
	static class Inner {    // Class file name will be like Outer$Inner.class for the Inner class
		
		public void display () {
			System.out.println("In Inner Display");
		}
	}
}

public class InnerDemo {			// Class file name will be InnerDemo.class

	public static void main(String[] args) {

		Outer obj = new Outer();
		
		Outer.Inner obj1 = new Outer.Inner();
		obj1.display();

	}

}
