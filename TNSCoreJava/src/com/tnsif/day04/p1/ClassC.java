//Program to define child ClassC from ClassA
package com.tnsif.day04.p1;

public class ClassC extends ClassA{
	
	//default constructor
	public ClassC() {
		System.out.println("ClassC default constructor.... ");
	//	System.out.println(privateNumber);// Private member is not inherited
		System.out.println(publicNumber);
		System.out.println(protectedNumber);
		System.out.println(number);
		System.out.println("------------------------------------------------");
	}
	public static void main(String args[]) {
		
		System.out.println("************************************************");
		ClassC obj = new ClassC();
		
	//	System.out.println(obj.privateNumber); Private member is not accessible
		System.out.println(obj.publicNumber);
		System.out.println(obj.protectedNumber);
		System.out.println(obj.number);
		System.out.println("------------------------------------------------");
		System.out.println(obj); //call toString method of ClassA
	}
}
