package com.tnsif.day07_final;

public class Circle extends Shape {
	private float radius;
	
	public Circle() {
		super();
		super.name = "Cirlce";
	}
	
	public Circle(float radius) {
		super();
		this.radius = radius;
		super.name = "Circle";
	}
	
	@Override
	public void calculateArea() {
		super.area = (float)(Math.PI*radius*radius);
		
	}
	
	public float getRadius() {
		return radius;
		
	}
	
	public void setRadius(float radius) {
		this.radius = radius;
	}
}
