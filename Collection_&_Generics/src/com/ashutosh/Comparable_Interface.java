package com.ashutosh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Stud implements Comparable<Stud> {	// We have implemented Comparable for comparing
	int rollNo, marks;
	String name;
	
	public Stud(int rollNo, String name ,int marks) {
		super();
		this.rollNo = rollNo;
		this.marks = marks;
		this.name = name;
	}

	@Override
	public String toString() {
		return "stud [rollNo=" + rollNo + ", marks=" + marks + ", name=" + name + "]";
	}
	
	public int compareTo(Stud s) {
		return marks>s.marks?1:-1;
	}
	
}

public class Comparable_Interface {

	public static void main(String[] args) {


		List<Stud> stud = new ArrayList<Stud>();
		
		stud.add(new Stud(1, "Ashutosh", 20));
		stud.add(new Stud(2, "Pankaj", 19));
		stud.add(new Stud(1, "Anshuman", 18));
		stud.add(new Stud(1, "LutKun", 17));
		
		Collections.sort(stud);		// If we directly pass comparator in this case, then it will 
									// Override the Comparable
		
		for(Object o : stud) {
			System.out.println(o);
		}
	}

}
