package com.tnsif.testcases.businesslogic;

public class Operations {
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static long getFactorial(int n) {
		int f = 1;
		if (n < 0)
			return -1;
		for (int i=1; i<=n; i++)
			f = f*i;
		return f;
	}
	
	public static boolean isPrime(int n) {
		boolean primeFlag = true;  //primeFlag = true, if prime
		for(int i = 2; i<=n/2; i++) {
			if (n%i == 0) {
				primeFlag = false;  //primeFlag = false, if non prime
				break;
			}
		}
		return primeFlag;
	}
	
	public static boolean isPalindrome(int n) {
		int n1 = n, rev = 0;
		while(n != 0) {
			rev = rev*10+n%10;
			n = n/10;
		}
		return n1 == rev;
	}
	
	public static boolean isPalindrome(String s) {
		return (s.equals(new StringBuffer(s).reverse().toString()));
	}
}
