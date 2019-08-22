package com.ashutosh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_Interface_Demo {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add(7);
		list.add(8);
		list.add(9);
		list.add("Ashutosh");
		list.add(2, 6);
		
		// List has index no as we have added 6 on index no 2 which is before 9
		for(int i=  0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// Implementing by Enhance For Loop
		for(Object o : list) {
			System.out.println(o);
		}
	}

}
