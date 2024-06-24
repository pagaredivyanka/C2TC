package com.tnsif.day19_generic_class;

public class GenericMethodDemo {
	public static void main(String[] args) {
		PalindromeClass object = new PalindromeClass();
		object.display(10);
		object.display("PVG");
		object.display(true);
		object.display(80.10);
		
//		PalindromeClass intObj = new PalindromeClass();
//		intObj.checkPalindrome("Hello");
		
		System.out.println("---------------------------------------");
		
		System.out.println("is 10 palindrome? : " + object.checkPalindrome(10));
		System.out.println("is 101 palindrome? : " + object.checkPalindrome(101));
		System.out.println("is 'CAR' palindrome? : " + object.checkPalindrome("Car"));
		System.out.println("is 'RACECAR' palindrome? : " + object.checkPalindrome("RACECAR"));
	}
}


//generic Palindrome method 
//check whether the data is palindrome or not