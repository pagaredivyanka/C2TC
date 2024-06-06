package com.tnsif.day10;

import java.util.Scanner;


public class ArrayExamples {
	public static void displayArray(int a[])
	{
		for (int i=0; i<n; i++)
			System.out.println(a[0] +"\t");
	}
	
	public static void main (String[] args) {
		int a[];
		
		//CTE
		/*a[0] = 12;
		  System.out.println(a[0]);*/
		
		//accept size of array 
		int n;
		System.out.println("Enter the size of array : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		a = new int[n];
		
		displayArray(a);
		
		System.out.println("enter "+ n + "numbers : ");
		for (int i=0;i<length;i++)
			a[i] = sc.nextInt();
		displayArray(a);
		
		
	}
}
