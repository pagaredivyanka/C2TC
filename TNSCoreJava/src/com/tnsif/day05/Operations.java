//Program to demonstrate accepting user input using Scanner and Buffered Reader Class
package com.tnsif.day05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Operations {
	//check whether no. is even or odd
	public void checkEvenOrOdd(int n) {
		
		if (n % 2 == 0) 
			System.out.println("even");
		else 
			System.out.println("odd");
	}
	//return factorial of a given number
	public long getFactorial(int n) {
		
		long factorial = 1;
		
		for (int i = 1; i <= n;i++) {
			factorial *= i; 
		}
		return factorial;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
	//	Scanner sc = new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Operations obj=new Operations();
		int n;
		
		System.out.print("Enter the number ");
	//	n=sc.nextInt();
		n=Integer.parseInt(br.readLine());
		
		obj.checkEvenOrOdd(n);
		
		System.out.println("Factorial is "+obj.getFactorial(n));
		
	//	System.out.println(sc.nextLine());
	//	System.out.println(sc.next());
	}

}
