package com.tnsif.day12;

public class ThreadJoinDemo {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("---------------------");
		
		ChildThread t1 = new ChildThread();
		ChildThread t2 = new ChildThread();
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		//run only when t1 and t2 complete there execution
		System.out.println("------------------End of Main-------------------");
	}
}
