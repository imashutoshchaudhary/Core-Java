package com.ashutosh;

class A {
	public void show() {
		System.out.println("In A");
	}
}

class B extends A{
	
	@Override							// It is used to Override methods from the super class
	public void show() {
		super.show();					// This will call the show() method from the super class
		System.out.println("In B");		// Basically super represents the parent class Object
	}
}

public class MethodOverridingDemo {

	public static void main(String[] args) {
		
		B obj = new B();
		obj.show();
	}

}
