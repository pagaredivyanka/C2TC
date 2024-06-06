package com.tnsif.day11;

public class WithExceptionHandling {

	public static void main(String[] args) {
		int a = 12, b = 0, c;
		try {
			c = a/b;
			System.out.println("Division is : " + c);
		}
		catch (ArithmeticException e) {
			System.out.println("Divide by zero error");
		}
		System.out.println("------------------");
	}

}
