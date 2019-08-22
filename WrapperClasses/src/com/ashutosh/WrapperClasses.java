package com.ashutosh;

public class WrapperClasses {

	public static void main(String[] args) {
		
		int i = 5;			// Primitive Data type
		Integer ii = new Integer(i);				// Wrapper (Boxing) Class   or 	Reference class
		
		int j = ii.intValue();			// Unwrapping or Unboxing
		
		Integer ik = i;					// AutoBoxing
		int k = ik;						//AutoUnboxing
		System.out.println(k);
	}

}
