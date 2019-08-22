package com.ashutosh;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TryWithResource {

	public static void main(String[] args) throws Exception {
		int n = 0;
		System.out.println("Enter a number");
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			n = Integer.parseInt(br.readLine());
		}
		System.out.println("Entered Number is "+n);
	}

}
