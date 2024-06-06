package com.tnsif.day09.runtimepolymorphism;

public class Student extends Person{

	private int rno;
	private String course;
	
	public Student() {
		super();
	}
		
	public Student(int rno, String course, String name, String city) {
		super(name,city);
		this.rno = rno;
		this.course = course;
	}
	
	@Override
	public String toString() {
		return "Student (roll no = " + rno + ", course = " + course + ")" + super.toString();
	}
}
