//Program to define child ClaasE from ClassA to demonstrate access specifier
package com.tnsif.dayfour.p2;

import com.tnsif.dayfour.p1.ClassA;

//child class
public class ClassE extends ClassA {
	public ClassE() {
		System.out.println("ClassC default constructor.... ");
	//	System.out.println(privateNumber); //Private member is not inherited outside class
		System.out.println(publicNumber);
		System.out.println(protectedNumber); 
	//	System.out.println(number); //Default member can't be accessible outside package
		System.out.println("------------------------------------------------");
	}
	public static void main(String args[]) {
		System.out.println("************************************************");
		ClassE obj = new ClassE();
		
	//	System.out.println(obj.privateNumber); //Private member is not accessible
		System.out.println(obj.publicNumber);
		System.out.println(obj.protectedNumber);
	//	System.out.println(obj.number); //Default member can't be accessible outside package 
		System.out.println("------------------------------------------------");
	}
}
