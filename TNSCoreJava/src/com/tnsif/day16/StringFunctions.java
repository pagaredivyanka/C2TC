package com.tnsif.day16;

public class StringFunctions {
	public static void main(String[] args) {
		String s = "Hello! How are you?";
		
		System.out.println("------------------------------------");
		System.out.println("string : " + s);
		System.out.println("------------------------------------");

		System.out.println("length of the string : " + s.length());
		System.out.println("starts with Hello? : " + s.startsWith("Hello"));
		System.out.println("starts with HELLO? : " + s.startsWith("HELLO"));
		System.out.println("ends with Hello? : " + s.endsWith("?"));
		System.out.println("char at 5th position : " + s.charAt(5));
		System.out.println("index of How : " + s.indexOf("How"));
		System.out.println("substring from index 7 : " + s.substring(7));  //prints string from index = 7
		System.out.println("substring from(7 - 10) : " + s.substring(7,10));

		System.out.println("replace Hello -> hi" + s.replace("Hello", "Hi"));
		System.out.println(s=(s.replace("Hello", "Hi")));

		System.out.println("string : " + s);
		System.out.println("toUpperCase()" + s.toUpperCase());
		System.out.println("toLowerCase()" + s.toLowerCase());
		
		System.out.println("---------------------------");
		
		String[] words = s.split(" ");
		for(String str:words)
			System.out.println(str);

	}
}
