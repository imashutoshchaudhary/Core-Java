package com.ashutosh;

class A {
	
	public void show() {
		System.out.println("In class show method");
	}
}

public class AnonymousClassDemo {

	public static void main(String[] args) {
		A obj = new A()
		  { 
			public void show() { 
				System.out.println("In Anonymous class"); 
			} 
		  }
		 ;						// Writing this type of class is known as anonymous class
		obj.show();

	}

}
