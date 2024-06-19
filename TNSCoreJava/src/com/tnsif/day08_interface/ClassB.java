package com.tnsif.day08_interface;

public class ClassB implements MyInterface, FirstInterface {
	
	@Override
	public String greet() {
		return "HELLO";
	}
	
	@Override
	public void show() {
		System.out.println("show() overriden from MyInterface");
	}
}
