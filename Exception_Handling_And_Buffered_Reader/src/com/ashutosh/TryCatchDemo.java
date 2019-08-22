package com.ashutosh;

public class TryCatchDemo {

	public static void main(String[] args) {
		
		try {
			int i = 9/0;
		}
		catch(ArithmeticException e) {
			System.err.println("Error");
		} finally {
			System.out.println("Finally Called");
		}
			
	}

}
