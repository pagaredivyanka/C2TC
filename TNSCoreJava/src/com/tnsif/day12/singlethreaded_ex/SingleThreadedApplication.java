package com.tnsif.day12.singlethreaded_ex;

import com.tnsif.day12.MyTask;

public class SingleThreadedApplication {

	public static void main(String[] args) {
		System.out.println("---------in main function----------" + Thread.currentThread());
		MyTask.sayHello(10);
		MyTask.displayEven();
		MyTask.sayHello(5);
		System.out.println("-----End of main-----");
	}

}
