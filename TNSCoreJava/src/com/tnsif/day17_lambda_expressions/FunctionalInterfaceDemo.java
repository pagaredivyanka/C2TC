package com.tnsif.day17_lambda_expressions;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + " ");
		
		Runnable r = () -> {
			
			for(int i=1;i<=50;i++) {
				System.out.println(Thread.currentThread().getName() + "Hello");
				try {
					Thread.sleep(500);
				} catch(InterruptedException e ) {
					e.printStackTrace();
				}
			}
				
			
		};
		
		//create child thread
		Thread t1=new Thread(r, "Thread1\t");
		Thread t2=new Thread(r, "Thread2\t");
		
		t1.start();
		t2.start();
		
		r = () -> {
			int i = 2;
			while(i<=100) {
				System.out.println(Thread.currentThread().getName() + " " + i);
				i+=2;
				try {
					Thread.sleep(300);
				} catch (InterruptedException e ) {
					e.printStackTrace();
				}
			}
		};
		
		Thread t3=new Thread(r, "Thread3\t");
		t3.start();
	}

}
