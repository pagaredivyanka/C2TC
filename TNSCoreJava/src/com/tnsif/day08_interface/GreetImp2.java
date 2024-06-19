package com.tnsif.day08_interface;

public class GreetImp2 implements IGreet {
	
	@Override
	public String sayHello(String name) {
		return "Hey" + name + "!! How are you?";
	}
	
}
