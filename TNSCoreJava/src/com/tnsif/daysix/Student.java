package com.tnsif.daysix;

public class Student extends Person{

	private int rno;
	
	
	public Student() {
		super();
		
	}


	public Student(String name, int age, int rno) {
		super(name, age);
		this.rno=rno;
	}


	@Override
	public String toString() {
		return super.toString() + ", Student [rno=" + rno  + "]";
	}
	
	

}
