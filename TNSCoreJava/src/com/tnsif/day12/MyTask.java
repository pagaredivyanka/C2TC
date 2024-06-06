package com.tnsif.day12;

public class MyTask {
	public static void sayHello(int n) throw InterreptedException {
		for (int i = 1; i <= n; i++) {
			System.out.println("Hello" + Thread.currentThread());
			Thread.sleep(300);
		}
	}
	public static void displayEven() {
		for(int i = 2; i <= 5; i++) {
			System.out.println(i + " " + Thread.currentThread());
		 	try {
		    	Thread.sleep(500);
		    } catch (InterruptedException e){
		    	e.printStackTrace();
		    }
		
		}
			
	}
}
