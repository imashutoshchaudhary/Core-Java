package com.ashutosh;

// Final keyword is used to make the variable constant and we can not change the value. after
// assigning a value.
// Final keyword doesn't allow any class to extend a final class.
// FInal keyword also restricts to doesn't override any method

class A {
	final int i =0;
	public A() {
		
	}
	
	public final void show () {
		System.out.println("In A Show");
	}
}

class B extends A{
	
}

public class FinalKeyword {

	public static void main(String[] args) {

		A obj = new A();
		
		System.out.println(obj.i);
	}

}
