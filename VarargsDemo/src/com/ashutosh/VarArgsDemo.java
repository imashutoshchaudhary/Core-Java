package com.ashutosh;

class Calc {
	
	public int add(int ...n ) {				// {4,5,4,2,8,5,2,7,6}  It is passing as an array
		int sum = 0;
		for(int k : n) {
			sum = sum + k;
		}
		return sum;
	}
	
}

public class VarArgsDemo {

	public static void main(String[] args) {
		
		Calc obj = new Calc();
		System.out.println(obj.add(4,5,4,2,8,5,2,7,6));

	}

}
