package com.tnsif.day15;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		
//		In treeMap data stored in (Key, value) pair
//		it sorted on Key basis
		TreeMap<String,String> personMap = new TreeMap<String, String>();
		personMap.put("divyanka@gmail.com", "Divyanka Pagare");
		personMap.put("ritesh@gmail.com", "Ritesh Girase");
		personMap.put("rama@gmail.com", "Rama");
		personMap.put("siddhika@gmail.com", "Siddhika Pagare");
		
		System.out.println(personMap + "\n");
		System.out.println("--------------------------------");
		
//		if we add the same key then it will replace the previous old (key,value) to new one 
//		value can be same but key must be unique
		
		personMap.put("rama@gmail.com", "Rama Pagare");   
		System.out.println(personMap + "\n");
		
		Set<String> emailIdSet = personMap.keySet();
		System.out.println(emailIdSet + "\n");
		
		Collection<String> names = personMap.values();
		System.out.println(names);
		System.out.println(personMap.get("divyanka@gmail.com"));
		System.out.println(personMap.get("divyanka123@gmail.com"));
		
		Set<Entry<String, String>> persons = personMap.entrySet();
		Iterator<Entry<String, String>> p = persons.iterator();
		while(p.hasNext()) {
			Map.Entry<String, String> entry = p.next();
			System.out.println(entry);
		}
	}
}


//hash map, linked hash Map and hash table is both allow null value
