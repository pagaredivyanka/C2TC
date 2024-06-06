package com.tnsif.day11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchBlock {
	public static void main(String[] args) {
		int a, b, c;
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter two numbers : ");
			a = sc.nextInt();
			b = sc.nextInt();
			c = a/b;
			System.out.println("division is " + c);
			throw new ArrayIndexOutOfBoundsException();
		} catch (ArithmeticException | InputMismatchException e) {
			System.err.println("Error.." + e.getMessage());
		}
		
		catch (Exception e) {
			System.out.println("Error occured.. " + e);
		}
		System.out.println("------------------");
	}

}
