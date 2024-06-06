package com.tnsif.day10;
public class searchInArray {
//	public static void main(String[] args) {
//		
//	}
//	
	public static void Search(int []a, int n) {
		System.out.println("Enter the number you want to search : " + s);
		for (int i=0;i<a.length;i++) 
		{
			if (a[i] == n) 
			{
				System.out.println("We got the number, position is " + i);
			} 
			else 
			{
				System.out.println("no. is not present in array");
			}
		}

	}

}


//public static void minMaxOfArray(int a[]) {
//	for(int i=0;i<a.length;i++) {
//		for(int j=0;j<a.length;j++) {
//			if(a[i]<a[j]) {
//				int temp=a[i];
//				a[i] = a[j];
//				a[j] = temp;
//			}
//		}
//	}
//	System.out.println("Max: "+ a[a.length-1]);
//	System.out.println("Min: "+ a[0]);
//}
