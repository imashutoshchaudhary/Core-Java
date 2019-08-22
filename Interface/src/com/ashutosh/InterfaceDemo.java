package com.ashutosh;

interface Writer {				// We are declaring a method here by interface
								// We can also achieve this by using abstract keyword as well
	void write();	// In interface when we declare any method it is by default public abstract
}								// In interface we cannot define any methods

class Pen implements Writer {

	public void write() {
		System.out.println("In Pen write");
	}
	
}

class Pencil implements Writer {
	
	public void write() {
		System.out.println("In Pencil write");
	}
	
}

class Kit {
	public void doSomething(Writer w) {
		w.write();
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		
		Kit kit = new Kit();
		Writer pen = new Pen();
		Writer pencil = new Pencil();
		
		//Writer write = new Writer();    // We can not create object of the Interfaces
										// But we can do so by creating a class which implementing a interface
		kit.doSomething(pencil);

	}

}
