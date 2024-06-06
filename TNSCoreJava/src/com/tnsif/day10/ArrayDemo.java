package com.tnsif.day10;

public class ArrayDemo {
	public static void main(String[] args) {
		int arr[]; //same as int[] arr; int []arr; 
		int[] b, d; //both b and d are array
		int []c,f; //c int array and f is just int
		
		//instantiate an array
		arr = new int[5];
		System.out.println(arr.length);
		
		//display array
		//index loop
		for (int i = 1; i < arr.length; i++)
			System.out.print(arr[i] + "\t");
		System.out.println("\n------------");
		
		//for..each loop
		for (int n : arr)
			System.out.println(n + "\t");
		
		//array declaration with initialization
		
		int arr1[] = {10, 20, 30, 40};
		System.out.print(arr1);
		
	}
}
