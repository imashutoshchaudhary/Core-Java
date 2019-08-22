package com.ashutosh;


class Calc {
	int num1;
	int num2;
	int result;
	
	public Calc(int num1, int num2) { //local variable
		this.num1 = num1; //instance variable we use this
		this.num2 = num2;
	}
}

public class This_Keyword {

	public static void main(String[] args) {
		
		Calc obj = new Calc(4,5);
		
		System.out.println(obj.num1);
		System.out.println(obj.num2);

	}

}
