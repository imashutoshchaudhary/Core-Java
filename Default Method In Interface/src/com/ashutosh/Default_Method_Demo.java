package com.ashutosh;

@FunctionalInterface	// When we override functional interface it means it is abstract
interface Demo {
	void Abc();
	default void show() {					// We can define method in interface by using default
		System.out.println("In Show Method");	// keyword
	}										// Default methods can be Overrided
}											// This interface is a functional Interface because
											// both the methods are different as Abc() is abstract
class Test implements Demo {
	public void Abc() {
		System.out.println("In Test Show");
	}
}

public class Default_Method_Demo {

	public static void main(String[] args) {
		
		Test obj = new Test();
		obj.show();
		obj.Abc();

	}

}
