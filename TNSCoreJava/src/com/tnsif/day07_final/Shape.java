package com.tnsif.day07_final;

public abstract class Shape {
	protected float area;
	protected String name;
	
	public void show() {
		System.out.println("Area of " + name + " is " + area);
		
	}
	
	abstract public void calculateArea();
}
