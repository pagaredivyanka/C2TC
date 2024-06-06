package com.tnsif.day12;

public class MultithreadedApplication {

	public static void main(String[] args) {
		System.out.println("------------in main function --------" + Thread.currentThread());
		
		ChildThreadOne t1=new ChildThreadOne();
		
		ChildThreadTwo t2=new ChildThreadTwo();
		
		ChildThreadThree t3=new ChildThreadThree();
		t1.start();  //run() method called implicitly
		t3.start();
		t3.start();   //convert into single threaded
		
//		t1.start(); // It gives Exception --> IllegalThreadStateException  when same thead called again
		System.out.println("------ End of main ------");
		
		
	}

}
