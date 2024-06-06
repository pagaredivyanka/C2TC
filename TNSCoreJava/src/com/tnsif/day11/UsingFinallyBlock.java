package com.tnsif.day11;

import java.util.Scanner;

public class UsingFinallyBlock {
	public static void main(String[] args) {
		Scanner sc=null;
		try {
			sc = new Scanner(System.in);
			String name;
			System.out.println("Enter your name: ");
			name = sc.nextLine();
			System.out.println("Welcom " + name);
			System.out.println("Your name contains " + name.length() + " characters");
			System.out.println("Your name starts with " + name.charAt(0));
		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("Error occured.." + e.getMessage());
		}
		finally {
			
			//used to write cleanup code
			System.out.println("I am in finally block");
			sc.close();
		}
		System.out.println("--------------------");
	}
	
	
}
