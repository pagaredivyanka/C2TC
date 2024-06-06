package com.tnsif.day12;

public class ChildThreadTwo extends Thread {
	public void run() {
		MyTask.displayEven();
	}
}
