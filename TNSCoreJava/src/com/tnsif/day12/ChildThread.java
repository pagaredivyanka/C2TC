package com.tnsif.day12;

public class ChildThread extends Thread{
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println(Thread.currentThread().getName() + " , " + i);
			try {
				Thread.sleep(200);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
