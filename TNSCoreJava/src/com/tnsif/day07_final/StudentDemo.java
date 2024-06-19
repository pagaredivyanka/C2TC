package com.tnsif.day07_final;

public class StudentDemo {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setUid("T050400710");
		s1.setName("Divyanka");
		s1.setBranch("Computer");
//		Student.setTechTrainer("Alpana");
//		Student.setSoftskillTrainer("Divya");
		
		Student s2 = new Student();
		s2.setUid("t050400720");
		s2.setName("Ritesh");
		s2.setBranch("AIDS");
//		Student.setTechTrainer("Alpana");
//		Student.setSoftskillTrainer("Divya");
		
		Student s3 = new Student("T050400800", "Vinu", "AIDS");
		
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
