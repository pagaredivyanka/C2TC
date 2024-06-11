package com.tnsif.day14;

import java.util.*;
//import java.util.Iterator;
//import java.util.ArrayList;
//import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		
		System.out.println(a.add(10));
		System.out.println(a.add(20));
		a.add(30);

//		a.add(new Integer(10)); //(Integer) deprecation
		
		
		System.out.println("ArrayList is : " + a);
		System.out.println("Size of array is : " + a.size());
		
		a.add(40);
		a.add(50);
//		a.add("Hey");
		System.out.println(a.add(20));
//		a.add(5.0);
		
		System.out.println("ArrayList is : " + a);
		System.out.println("Is 30 present : " + a.contains(30));
		System.out.println("Is 300 present : " + a.contains(300));
		System.out.println("Index of 20 is : " + a.indexOf(20));
		System.out.println("last Index of 20 is : " + a.lastIndexOf(20));
		System.out.println("last Index of 70 is : " + a.lastIndexOf(70));
		System.out.println(a.remove(4));
		System.out.println("Index of (4) is : " + a.indexOf(4));
		System.out.println(a);
		System.out.println("******************************");

		System.out.println("remove 30 : " + Integer.valueOf(30));
		
		
//		(ClassCastException) if the array has different type of data 
//		Collections.sort(a);
//		System.out.println("List after Sorting : " + a);
		
		
		Iterator i = a.iterator();
		System.out.println("-------------------------");
		while(i.hasNext())
			System.out.println(i.next());

	}

}
