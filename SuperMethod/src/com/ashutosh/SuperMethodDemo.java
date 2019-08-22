package com.ashutosh;

class A {
	
	public A() {
		System.out.println("In A");
	}
	
	public A(int i) {
		System.out.println("In A int");
	}
}

class B extends A{
	
	public B() {
		super(5);						// It is given By Default by compiler
		System.out.println("In B");
	}
	
	public B(int i) {
		super(i);						// If we pass a parameter in super then it will call
		System.out.println("In B int");	// parameterised constructor in Super class
	}
}

public class SuperMethodDemo {

	public static void main(String[] args) {
		
		B obj = new B(5);
	}

}
