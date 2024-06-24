package com.tnsif.day18_stream_api.userdefinedfunctionalinterface;

public class FunctionalInterfaceDemo {
	public static void main(String[] args) {
		GreetInterface obj = (s) -> System.out.println("Hello " + s);
		
		obj.greet("Students");
		obj = (s) -> System.out.println("Gutern Morgan " + s);
		obj.greet("Students");
	}
}



//parameter -> s
//variable name -> obj