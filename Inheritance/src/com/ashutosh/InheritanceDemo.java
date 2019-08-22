package com.ashutosh;					// IS-A   HAS-A Pattern

class Calc {							// Super Class
	
	public int add(int i,int j) {
		return i+j;
	}
}

class CalcAdv extends Calc{				// Single Level inheritance
										// Sub Class
	
	public int sub(int i,int j) {
		return i-j;
	}
	
}

class CalcVeryAdv extends CalcAdv {		// Multi Level Inheritance
	public int mul(int i,int j) {
		return i*j;
	}
}


public class InheritanceDemo {		

	public static void main(String[] args) {
		
		CalcVeryAdv obj = new CalcVeryAdv();
		
		int result1 = obj.sub(4, 5);
		int result2 = obj.add(4,5);
		int result3 = obj.mul(4, 5);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);

	}

}
