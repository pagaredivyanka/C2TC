//Program to define ClaasD to demonstrate access specifier
package com.tnsif.day04.p2;

import com.tnsif.dayfour.p1.ClassA;

public class ClassD {
	public static void main(String args[]) {
	//	ClassA from another package
		ClassA objA = new ClassA();
		
	//	System.out.println(objA.privateNumber); //Private member is not accessible
		System.out.println(objA.publicNumber);
	//	System.out.println(objA.protectedNumber); //Protected member is not accessible in another package non-subclass
	//	System.out.println(objA.number); //Default member is not accessible in another package
		System.out.println("------------------------------------------------");
	}
}
