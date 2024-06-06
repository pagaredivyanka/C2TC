package com.tnsif.day11;

public class CourseDemo {

	public static void main(String[] args) {
		StudentInfo s;
		try {
			s = new StudentInfo("Divyanka","BE");
			System.out.println(s);
			
			StudentInfo ss = new StudentInfo();
			ss.setName("Ritesh");
			ss.setCourse("MCA");
			System.out.println(ss);
			
			StudentInfo sss=new StudentInfo("Sneha","Diploma");
			
		}
		catch (InvalidCourseException e) {
			System.out.println("Error.." + e);
		}
	}

}
