package com.tnsif.day08_interface;

public class InterfaceDemo {
	public static void main(String[] args) {
		MyInterface o;
		o = new ClassA();
		o.show();
		
		ClassB oB = new ClassB();
		oB.show();
		System.out.println(oB.greet());
		
		
		ClassD oD = new ClassD();
		oD.display();
	}
}
