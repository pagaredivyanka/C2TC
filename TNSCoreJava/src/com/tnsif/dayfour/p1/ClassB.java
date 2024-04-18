package com.tnsif.dayfour.p1;

public class ClassB {
	public static void main(String args[]) {
		
		ClassA objA = new ClassA();
		
	//	System.out.println(objA.privateNumber); Private member is not accessible
		System.out.println(objA.publicNumber);
		System.out.println(objA.protectedNumber);
		System.out.println(objA.number);
		System.out.println("------------------------------------------------");
		System.out.println(objA); //call toString method of ClassA
		
		ClassB objB = new ClassB();
		System.out.println(objB); //call toString method of Object Class
	}
}
