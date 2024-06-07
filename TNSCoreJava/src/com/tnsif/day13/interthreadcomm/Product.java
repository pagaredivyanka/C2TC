package com.tnsif.day13.interthreadcomm;

public class Product {
	private int n;
	boolean status = true;
	
	synchronized void put() throws InterruptedException {
		
		if (status) 
		{
			n++;
			System.out.println("Product produced : " + n);
			notify();
			status = true;
		}
		else 
		{
			wait();
			status = true;
		}
	}
	
	synchronized void get() throws InterruptedException {
		if (!status) 
		{
			System.out.println("Product produced : " + n);
			status = true;
			notify();
		}
		else 
		{
			wait();
			status = false;
		}
	}
}
