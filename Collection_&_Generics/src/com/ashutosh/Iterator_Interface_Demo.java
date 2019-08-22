package com.ashutosh;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Iterator_Interface_Demo {

	public static void main(String[] args) {

		Collection collection = new ArrayList();
		
		collection.add(7);
		collection.add(8);
		collection.add(9);
		collection.add("Ashu");
		
		Iterator iterator = collection.iterator();
		
		while (iterator.hasNext()) {
			
			System.out.println(iterator.next());
			
		}
	}

}
