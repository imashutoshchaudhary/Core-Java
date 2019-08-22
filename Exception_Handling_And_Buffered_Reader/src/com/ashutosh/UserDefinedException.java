package com.ashutosh;

public class UserDefinedException {

	public static void main(String[] args) {
		
		int i = 8, j = 9;
		
		try {
			int k = i/j;
			if (k==0) 
				throw new MyException("This is not possible");
		} 
		catch (MyException e) {
			System.out.println("Error "+e.getMessage());
		}
		
		

	}

}
