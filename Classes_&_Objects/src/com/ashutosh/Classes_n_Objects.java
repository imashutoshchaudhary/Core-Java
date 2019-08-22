package com.ashutosh;

class Calc {
	int num1;
	int num2;
	int result;
	
	public void perform() {
		result = num1 + num2;
	}
	
	public void minus() {
		result = num1-num2;
	}
}

public class Classes_n_Objects {

	public static void main(String[] args) {
		
		Calc obj = new Calc();
		obj.num1 = 2;
		obj.num2 = 6;
		
		obj.perform(); 
		obj.minus();
		
		System.out.println(obj.result);

	}

}
