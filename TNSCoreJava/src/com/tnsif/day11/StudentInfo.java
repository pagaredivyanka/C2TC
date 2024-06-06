package com.tnsif.day11;

public class StudentInfo {
	String name;
	String course;
	
	public StudentInfo() {}
	
	public StudentInfo(String name, String course) throws InvalidCourseException {
		super();
		
		this.name = name;
		if (course.equals("BE") || course.equals("MCA") || course.equals("MSc"))
			this.course = course;
		else 
			throw new InvalidCourseException("Course must be either BE/MCA/MSc");
			
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	
	public void setCourse(String course) throws InvalidCourseException {
		if(course.equals("BE") || course.equals("MCA") || course.equals("MSc"))
			this.course = course;
		else
			throw new InvalidCourseException("Course must be either BE/MCA/MSc");
	}
}
