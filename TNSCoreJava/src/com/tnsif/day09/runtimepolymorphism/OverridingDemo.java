package com.tnsif.day09.runtimepolymorphism;

public class OverridingDemo {

	public static void main(String[] args) {
		ClassA obj;
		
		obj = new ClassA();
		obj.setN(10);
		obj.show(); //show() of ClassA		
		
		obj = new ClassB(); obj.setN(20); obj.show(); //show() of ClassB
		
		ClassB bObj = new ClassB();
		bObj.setName("PVG Students");
		bObj.show();
		
		Person p1 = new Person("Divyanka", "Nashik");
		System.out.println(p1);
		
		Student s1 = new Student(101, "Computer", "Ritesh", "Pune");
		System.out.println(s1);
	}
}
