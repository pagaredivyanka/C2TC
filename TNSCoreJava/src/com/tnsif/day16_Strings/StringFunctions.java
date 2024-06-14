package com.tnsif.day16_Strings;

public class StringFunctions {
	public static void main(String[] args) {
		String s = "Hello! How are you?";
		System.out.println("string : " + s);
		System.out.println("length of the string : " + s.length());
		System.out.println("starts with Hello? : " + s.startsWith("Hello"));
		System.out.println("starts with HELLO? : " + s.startsWith("HELLO"));
		System.out.println("ends with Hello? : " + s.endsWith("?"));
		System.out.println("print the character at 5th position : " +s.charAt(5));
		System.out.println(s.indexOf("How"));
		System.out.println(s.substring(7));
		System.out.println(s.substring(7,10));

		System.out.println(s.replace("Hello", "Hi"));
		System.out.println(s=(s.replace("Hello", "Hi")));

		System.out.println("string : " + s);
		System.out.println(s.toUpperCase());
		System.out.println(s);
		System.out.println(s.toLowerCase());
		System.out.println("string : " + s);
		
		System.out.println("---------------------------");
		
		String[] words = s.split(" ");
		for(String str:words)
			System.out.println(str);

	}
}
