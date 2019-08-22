package com.ashutosh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator_Demo {

	public static void main(String[] args) {


		List<Integer> list = new ArrayList<>();
		list.add(789);
		list.add(456);
		list.add(123);
		list.add(147);
		list.add(258);
		
		// Demo of Comparator for sorting of number on the basis of last number which is commented
		
		/*
		 * Comparator<Integer> comparator = new Comparator<Integer>() { public int
		 * compare(Integer x, Integer y) { if (x%10>y%10) { return 1; } else { return
		 * -1; } }
		 * 
		 * };
		 */
				
		Collections.sort(list, (x,y) -> x%10>y%10?1:-1);
		
		// We have fitted the logic of comparator in one line of code using Lambda exp & ternary operator 
		
		for(Integer i : list) {
			System.out.println(i);
		}
	}

}
