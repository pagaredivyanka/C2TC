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
}
