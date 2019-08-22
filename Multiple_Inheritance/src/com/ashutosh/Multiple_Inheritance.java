package com.ashutosh;

interface Demo {
	
	default void show() {
		System.out.println("In Demo Show");
	}
}

interface MyDemo {
	
	default void show() {
		System.out.println("In MyDemo Show");
	}
}

class MyClass implements Demo, MyDemo {		// Multiple Inheritance with Interfaces
	@Override
	public void show() 
	{
		MyDemo.super.show();
	}
}

public class Multiple_Inheritance {

	public static void main(String[] args) {

		MyClass obj = new MyClass();
		obj.show();

	}

}
