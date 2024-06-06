package com.tnsif.day12;

public class MyTask {
	public static void sayHello(int n) {
		System.out.println("Hello" + Thread.currentThread());
	}
	public static void displayEven() {
		for(int i = 2; i <= 5; i++)
			System.out.println(i);
	}
}
