/* 
Program to demonstrate method overloading - defining same name methods with different 
signatures in same scope 
signature - 1. different no of parameters
            2. different data types
            3. different order of variable 
*/
package com.tnsif.day09;

public class Operations {
		
		public static void add()
		{
			System.out.println("Addition");		
		}
		public static void add(int a)
		{
			System.out.println("Addition is "+ a);		
		}
		public static void add(int a,int b)
		{
			System.out.println("Addition is "+ (a + b));		
		}
		public static void add(int c, float d)
		{
			System.out.println("Addition is "+ (c + d));		
		}
		

}
