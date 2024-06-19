package com.tnsif.day08_interface;

public class ClassA implements MyInterface{
	
	@Override 
	public void show() {
		System.out.println("show() overriden from MyInterface");
	}
}
