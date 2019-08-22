package com.ashutosh;

class Calc {
	
	public void add(int i, int k) {
		System.out.println(i+k);
	}
	
	public void add(int i, int k,int j) {
		System.out.println(i+k+j);
	}
	
	public void add(double i, double j) {
		System.out.println(i+j);
	}
}

public class Method_Overloading {

	public static void main(String[] args) {
		Calc obj = new Calc();
		obj.add(4, 5);
		obj.add(8, 7, 5);
		obj.add(45.9, 41.2);

	}

}
