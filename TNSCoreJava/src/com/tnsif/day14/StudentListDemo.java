package com.tnsif.day14;

import java.util.*;
import javax.swing.plaf.synth.SynthStyleFactory;


public class StudentListDemo {
	public static void main(String[] args) {
		ArrayList<Student> studList = new ArrayList<Student>();
		
		Student s = new Student();
		
		studList.add(new Student(32,"Divyanka", 85));
		studList.add(new Student(10,"Ritesh", 83));
		studList.add(new Student(23,"Sneha", 86));
		studList.add(new Student(87,"Prerna", 81));
		studList.add(new Student(54,"Divyanka", 78));

		System.out.println("------Student List before Sorting------");
		System.out.println(studList);
		
		Collections.sort(studList);
		System.out.println("------Student List after Sorting------");
		System.out.println(studList);
		
		
	}

}
