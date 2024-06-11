package com.tnsif.day14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.*;

public class HomogeneousList {

	public static void main(String[] args) {
		
//		Create String type List
		ArrayList<String> nameList = new ArrayList<String>();
		nameList.add("Divyanka");
		nameList.add("Ritesh");
		nameList.add("Rinku Pagare");
		nameList.add("Vinu Girase");
		nameList.add("Siddhika");
		nameList.add("Sneha");
//		nameList.add(6); //we can't add data other than string
		System.out.println("List is : " + nameList);
		Collections.sort(nameList);
		System.out.println("Sorted List : " + nameList);
		
//		Create PersonList
		ArrayList<Person> personList = new ArrayList<Person>();
		personList.add(new Person("Divyanka", "Nashik", 2233445566L));
		personList.add(new Person("Shrikant", "Nashik", 9423334444L));
		personList.add(new Person("Ritesh", "Nashik", 8759393834L));
		personList.add(new Person("Sneha", "Pune", 7543537333L));
		personList.add(new Person("Prerna", "Nagpur", 9998886665L));
		personList.add(new Person("Meghana", "Mumbai", 7889743353L));
		
//		Sort PersonList
		//Collections.sort( personList);
		//System.out.println("Sorted PersonList " + personList);
		
		Iterator<Person> it = personList.iterator();
		while(it.hasNext()) {
			Person p = it.next();
			System.out.println("Person is : " + p);
//			it.remove();
		}
		
		System.out.println("--------------------------");
		System.out.println(personList.size());
		
		
//		left side (arguments) -> right side (Declaration) -----> this is anonymous class
		
//		Sorting on Ascending order by "name"
		
		Comparator<Person> comp =(p1, p2)->p1.getName().compareTo(p2.getName());
		
		
		Collections.sort(personList, comp);
		System.out.println("---------Sorting in Ascending order by Name---------");
		System.out.println(personList);
		
//		Sorting on Ascending order by "ContactNo"
		comp =(p1, p2)->p1.getCity().compareTo(p2.getCity());
		System.out.println("---------Sorting in Ascending order by City---------");

		System.out.println(personList);
	}

}
