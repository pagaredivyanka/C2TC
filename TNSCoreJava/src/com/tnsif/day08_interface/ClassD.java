package com.tnsif.day08_interface;

public class ClassD implements OuterInterface.InnerInterface{
	
	@Override
	public void display() {
		System.out.println(OuterInterface.N);
		System.out.println(OuterInterface.InnerInterface.N);
	}
}
