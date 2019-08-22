package com.ashutosh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Generics_With_List {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();		// Lists are Mutable means we can change its values
		list.add(7);
		list.add(4);
		list.add(5);
		
		Collections.sort(list);			// For Sorting
		Collections.reverse(list);		// For Reverse Sorting
		Collections.shuffle(list);		// For random Order
		
		for(Integer o : list) {
			System.out.println(o);
		}

	}

}
