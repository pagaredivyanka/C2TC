package com.tnsif.day16;

public class StringDemo {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String("Hello");
		System.out.println("use of (==)");
		System.out.println("s1 == s2 : " + (s1 == s2));
		System.out.println("s1 == s3 : " + (s1 == s3));
		System.out.println("------------------------");
		
		System.out.println("use of ( .equals() )");
		System.out.println("s1.equals(s2) : " + s1.equals(s2));
		System.out.println("s1.equals(s3) : " + s1.equals(s3));
		System.out.println("------------------------");
		
		String s4 = s1;
		String s5 = s3;
		String s6 = new String(s3);
		String s7 = s3.intern();  //
		
//		Immutable --> we can't change the string if we created 
//		mutable --> can be modified
		
		System.out.println("s1 == s4 : " + (s1 == s4)); //check memory reference - true
		System.out.println("s5 == s3 : " + (s5 == s3)); //check memory reference - true
		System.out.println("s6 == s3 : " + (s6 == s3)); //check memory reference - false
		System.out.println("s6 == s3 : " + (s7 == s3)); //check memory reference - false

		System.out.println("------------------------");
		
		
//		for any single change it allocate new instance 
//		using "new" allocate m/m directly into heap memory 
		
		s1 = "Hi";  //create another instance in string pool
		s3 += "! How are you?"; //create another instance in string pool
		System.out.println("s1 : " + s1);  //
		System.out.println("s3 : " + s3);
		System.out.println("s1 == s2 : " + (s1 == s2));  //check memory reference - false 
		System.out.println("s1 == s3 : " + (s1 == s3));  //check memory reference - false
		System.out.println("s5 == s3 : " + (s5 == s3));  //check memory reference - false


		
	
	}

}
