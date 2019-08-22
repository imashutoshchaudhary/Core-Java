package com.ashutosh;

interface Demo {
	// We can also declare variable in a interface but this interface is final (constant)
	int num = 8;
	// We can also define a method in interface by using static method
	static void show() {
		System.out.println("In Static show");
	}
}

public class Static_Method_In_Interface {

	public static void main(String[] args) {
		Demo.show();
	}

}
