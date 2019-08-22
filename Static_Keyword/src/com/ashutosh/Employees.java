package com.ashutosh;

class Emp {
	int empid;
	int salary;
	static String ceo;
	
	
	  public Emp() { // Constructor will executed when we create a object 
		  empid =1; 
		  salary = 6000; 
		  System.out.println("In Constructor"); 
	  }
	
	 static { 	// static block will executed when we load a class 
		 ceo = "Larry";
		 System.out.println("In Static"); 
	 }
	 
	
	
	
	public void show() {
		System.out.println(empid+" : "+salary+" : "+ceo);
	}
}

public class Employees {

	public static void main(String[] args) {
	
		Emp ashu = new Emp();
		
		/*
		 * ashu.empid=1; ashu.salary=4000; ashu.ceo="Ashutosh";
		 */
		 
		
		Emp nik = new Emp();
		
		/*
		 * nik.empid=2; nik.salary=5000; Emp.ceo="Ashu";
		 */
		
		ashu.show();
		nik.show();
		

	}

}
