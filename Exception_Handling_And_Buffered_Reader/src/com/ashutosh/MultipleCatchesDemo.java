package com.ashutosh;

public class MultipleCatchesDemo {

	public static void main(String[] args) {
		
		try 
		{
			int a[] = new int[5];
			a[6] = 5;
			int i = 9/0;
			System.out.println("In try");
		}
		catch(ArithmeticException e) 
		{
			System.err.println("Cannot divide by zero");
		} 
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.err.println("Stay In your Limits...");
		}
		finally 
		{
			System.out.println("Finally Called");
		}

	}

}
