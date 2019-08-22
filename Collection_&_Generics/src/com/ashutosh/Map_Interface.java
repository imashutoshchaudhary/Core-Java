package com.ashutosh;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_Interface {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();	// We can also use HashTable for Synchronization
		
		map.put("name", "Ashutosh");
		map.put("fav", "Java");
		map.put("exp", "one");
		map.put("exp", "two");		// Map will not accept duplicate values it will just overwrite it
		
		Set<String> key = map.keySet();
		
		for (String keys : key) {
			System.out.println(keys +" "+map.get(keys));
		}

	}

}
