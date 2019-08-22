package com.ashutosh;

// Need of abstract class ?
// 

abstract class Human {				// Abstract class
	
	public abstract void Eat();
	
	public void Walk() {
		
	}
	
}

class Man extends Human {			// Concrete class
	
	// When we extend a abstract class it is compulsory to define the method of the abstract class
	// Like this
	public void Eat() {
		
	}
	
}

public class AbstractKeyword {

	public static void main(String[] args) {

		// Abstract Keyword restricts creation of object of any Class.
		// By using Abstract keyword we can declare methods directly but we have to use abstract 
		// class as well.
		
		Human obj = new Man();

	}

}
