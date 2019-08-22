package com.ashutosh;

// Types of Interface
// 1. Normal Interface : Interface more than one method inside
// 2. Single Abstract method : Interface with only one method
// 		Note : Single Abstract method name changed by Functional Interface after Java 1.8
// 3. Marker Interface : Marker Interface doesn't have any method inside it.

interface Abc {
	void show();
}

public class Functional_Interface_Demo {

	public static void main(String[] args) {
		
		Abc obj = () -> System.out.println("I'm Lambda Expression");
		obj.show();
		// Note : Lambda Expression can only be used in Functional Interface
	}

}
