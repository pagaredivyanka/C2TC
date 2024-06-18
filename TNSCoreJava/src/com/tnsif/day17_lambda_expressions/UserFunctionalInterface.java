package com.tnsif.day17_lambda_expressions;

public class UserFunctionalInterface {
	
	public static void main(String[] args) {
		GreetInterface greet = (s)->"Hello "+ s;
		System.out.println(greet.sayHello("Students!"));
		
		greet = (s)->"Hi "+ s + "How are you?";
		System.out.println(greet.sayHello("Students! "));
		
	}
	
}

class Greet1 implements GreetInterface{
	public String sayHello(String name) {
		return "Hello" + name;
	}
}

class Greet2 implements GreetInterface{
	public String sayHello(String name) {
		return "Hello" + name + "How are you?";
	}
}