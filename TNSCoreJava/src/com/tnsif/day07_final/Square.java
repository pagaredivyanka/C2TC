package com.tnsif.day07_final;

public class Square extends Shape {
	private float side;
	public Square() {
		super();
		super.name = "Square";
		
	}
	
	public Square(float side) {
		super();
		this.side = side;
		super.name = "Square";
	}
	
	@Override
	public void calculateArea() {
		super.area = side*side;
	}
	
}
