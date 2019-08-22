package com.ashutosh;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CheckedExceptionDemo {

	public static void main(String[] args) throws Exception { 	// Checked Exception
		
		int n = 0;
		System.out.println("Enter a number");
		
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			n = Integer.parseInt(bufferedReader.readLine());
		}
		finally {
			bufferedReader.close();
			System.out.println("Closed");
		}
		System.out.println("Entered Number is "+n);

	}

}
