package com.tnsif.day09;

public class MethodOverloadingDemo {

	public static void main(String[] args) {
		
		Operations.add();
		Operations.add(12);
		Operations.add(12,45);
		Operations.add(45, 12.10f);
	
		
		System.out.println("\n");
	}

}
