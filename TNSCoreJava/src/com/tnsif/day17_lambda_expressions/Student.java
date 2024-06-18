package com.tnsif.day17_lambda_expressions;

public class Student {
	private int rollNo;
	private String name;
	private float per;
	private String stream;
	
	
	
	public Student() {
		super();
	}
	
	public Student(int rollNo, String name, float per, String stream) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.per = per;
		this.stream = stream;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", per=" + per + ", stream=" + stream + "]\n";
	}

	
}
