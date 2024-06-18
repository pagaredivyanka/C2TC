package com.tnsif.day17_lambda_expressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FunctionalInterfaceDemo1 {

	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList.add(60);
		numList.add(50);
		numList.add(90);
		numList.add(40);
		numList.add(20);
		numList.add(80);
		numList.add(10);
		numList.add(50);

//		for integer, short, long, float, double -> use (Comparator) 
		System.out.println("Before Sorting : ");
		System.out.println(numList);
		
		Collections.sort(numList);
		System.out.println("\nsorting in Ascending order): ");
		System.out.println(numList);
		
		System.out.println(" ");
		Comparator<Integer> comp = (n1 , n2) -> (n2 - n1);
		Collections.sort(numList, comp);
		System.out.println("sorting in descending order :");
		System.out.println(numList);
		
		System.out.println(" ");
		
//		for string we use compareTo method 
//		Ascending = s1.compareTo(s2)  
//		Descending = s2.compareTo(s1)
		
		ArrayList<String> nameList = new ArrayList<String>();
		nameList.add("Pooja");
		nameList.add("Rinku");
		nameList.add("Vinu");
		nameList.add("Divyanka");
		nameList.add("Rama");
		nameList.add("Siddhika");
		nameList.add("Sneha");
		
		System.out.println("---------------------------------");
		System.out.println("nameList : " + nameList);
		Collections.sort(nameList);
		System.out.println("\nAscending Order : ");
		System.out.println(nameList);
		
		Comparator<String> strcomp= (s1, s2)->s2.compareTo(s1);
		Collections.sort(nameList, strcomp);
		
		System.out.println("\nDescending Order : ");
		System.out.println(nameList);
		 
		ArrayList<Student> studList = new ArrayList<Student>();
		studList.add(new Student(10, "Ritesh", 89, "AIDS"));
		studList.add(new Student(10, "Divyanka", 90, "Computer"));
		studList.add(new Student(10, "Rinku", 65, "Computer"));
		studList.add(new Student(10, "Rama", 73, "AIDS"));
		studList.add(new Student(10, "Vinu", 60, "AIDS"));
		studList.add(new Student(10, "Sneha", 75, "CS"));
		
		System.out.println("---------------------------------");
		System.out.println("\nAscending Order : \n");
		System.out.println(studList);
		
		Comparator<Student> studcomp= (n1, n2)->n1.getName().compareTo(n2.getName());
		Collections.sort(studList, studcomp);
		
		System.out.println("------------------------------------------");
		
		Comparator<Student> studcomp1= (n1, n2)->n2.getName().compareTo(n1.getName());
		Collections.sort(studList, studcomp1);
		
		System.out.println("\nDescending Order : \n");
		System.out.println(studList);
	}

}
