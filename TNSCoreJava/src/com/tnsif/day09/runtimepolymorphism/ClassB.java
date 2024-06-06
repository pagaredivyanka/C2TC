package com.tnsif.day09.runtimepolymorphism;

public class ClassB extends ClassA{
	String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void show() {
		System.out.println("Name - " + name);
	}
}
