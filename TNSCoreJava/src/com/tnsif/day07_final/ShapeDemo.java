package com.tnsif.day07_final;

public class ShapeDemo {
	public static void main(String[] args) {
		Shape s;
//		s = new Shape(); cannot instantiate the type Shape as it is abstract
		s = new Circle();
		Circle c = (Circle)s;
		c.setRadius(3.5f);
		c.calculateArea();
		c.show();
		
		System.out.println("----------------------------");
		
		s = new Square(20);
		s.calculateArea();
		s.show();
	}
}
