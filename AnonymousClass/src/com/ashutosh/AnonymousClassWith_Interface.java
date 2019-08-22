package com.ashutosh;

interface Abc {
	void show();
}

public class AnonymousClassWith_Interface {

	public static void main(String[] args) {
		
		Abc obj = new Abc() {
			public void show() {
				System.out.println("In Show Method");
			}
		};
		obj.show();
						
	}

}
