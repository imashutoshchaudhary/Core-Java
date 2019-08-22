package com.ashutosh;

class A {
	public void show() {
		System.out.println("In A");
	}
}

class B extends A{
							
	public void show() {			
		System.out.println("In B");		
	}
}

class C extends A{
	
	public void show() {			
		System.out.println("In C");		
	}
}

public class DynamicMethodDispatchDemo {

	public static void main(String[] args) {
		
		A obj = new B();					// RunTime Polymorphism
		obj.show();
		
		obj = new C();						// Dynamc Method Dispatch
		obj.show();
	}

}
