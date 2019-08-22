package com.ashutosh;

class Calc {
	int num1;
	int num2;
	
	public Calc() {
		num1 = 5;
	}
	
	public Calc(int i) {
		num1 = 6;
	}
	
	
}

public class Cons {

	public static void main(String[] args) {
		
		Calc obj = new Calc();
		
		System.out.println(obj.num1);

	}

}
