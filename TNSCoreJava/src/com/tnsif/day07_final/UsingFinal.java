package com.tnsif.day07_final;

public class UsingFinal {
	int x;
	final int y = 10;  // constant with value 10 
	final int z;  //Initialize constant using constructor
	
	public UsingFinal() {
		x++;
//		y++; The final y can't be assigned
		z = 20;
	}
	
	public UsingFinal(int value) {
		x = value;
		z = value;
//		y = value; The final y can't be assigned
	}

	@Override
	public String toString() {
		return "UsingFinal [x=" + x + ", y=" + y + ", z=" + z + "]\n";
	}
	
	
}
