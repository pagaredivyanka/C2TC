package com.tnsif.daythree;

public class Point {
	private float x,y;
	//default constructor
	public Point() {
		x = 0.0f;
		y = 0.0f;
	}
	//single parameter constructor
	public Point(float value) {
		x  = value;
		y = value;
	}
	//double parameter constructor
	public Point(float a, float b) {
		x = a;
		y = b;
	}
	//setter 
	public void setX(float value) {
		x = value;
	}
	
	public void setY(float value) {
		y = value;
	}
	//getter
	public float getX() {
		return x;
	}
	
	public float getY() {
		return y;
	}
	
	public void display() {
		System.out.println("Point is ("+x+", "+y+")");
	}
	
}
