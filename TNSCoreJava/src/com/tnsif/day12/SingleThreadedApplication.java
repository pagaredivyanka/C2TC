package com.tnsif.day12;

public class SingleThreadedApplication {

	public static void main(String[] args) {
		System.out.println("---------in main function----------" + Thread.currentThread());
		MyTask.sayHello(10);
		MyTask.displayEven();
		MyTask.sayHello(5);
		System.out.println("-----End of main-----");
	}

}
