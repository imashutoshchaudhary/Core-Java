package com.ashutosh;

// Encapsulation Means binding of data with methods

class Stud {
	
	private int rollNo;
	private String name;
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}

public class EncapsulationDemo {

	public static void main(String[] args) {
		
		Stud obj = new Stud();
		obj.setRollNo(3);
		obj.setName("Ashutosh");
		System.out.println(obj.getRollNo());
		System.out.println(obj.getName());

	}

}
