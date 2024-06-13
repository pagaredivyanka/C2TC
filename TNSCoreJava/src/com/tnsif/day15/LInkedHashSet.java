package com.tnsif.day15;

import java.util.*;
//import java.util.Iterator;
//import java.util.LinkedHashSet;


public class LInkedHashSet {
	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(60);
		lhs.add(70);
		lhs.add(80);
		lhs.add(40);
		lhs.add(90);
		lhs.add(20);
		lhs.add(70);
		System.out.println(lhs);
		Iterator<Integer> it = lhs.iterator();
		while( it.hasNext())
			System.out.println(it.next() + "\t");
		
		System.out.println("Size : " + lhs.size());
		lhs.remove(20); //remove function return value true
		lhs.remove(30); //remove function return value false
		System.out.println(lhs);
		
		System.out.println("--------------------\n");

//		for sorting set we have to convert it into list and 
//		after sorting is done then again convert it into set
//		Collections.sort(lhs);  //this is not directly applicable for LinkedHashSet
		
		ArrayList<Integer> a = new ArrayList<Integer>(lhs);
		System.out.println("Before Sorting : " + a);
		
		Collections.sort(a);
		System.out.println("After Sorting : " + a); //sorted Array List
		
		lhs = new LinkedHashSet<Integer>(a);
		System.out.println(lhs);

	}
}
