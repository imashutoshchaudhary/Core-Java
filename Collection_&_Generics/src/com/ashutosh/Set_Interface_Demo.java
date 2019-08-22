package com.ashutosh;

import java.util.HashSet;
import java.util.Set;

public class Set_Interface_Demo {

	public static void main(String[] args) {


		Set<Integer> set = new HashSet<Integer>();	// We can also use TreeSet for accessing in 
													// Ascending order
		set.add(7);
		set.add(8);
		set.add(9);
		set.add(4);
		set.add(4);		// This value is not added because set remove the duplicate values 
		
		for(int i : set) {
			System.out.println(i);
		}

	}

}
