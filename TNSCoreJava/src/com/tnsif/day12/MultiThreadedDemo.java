package com.tnsif.day12;

public class MultiThreadedDemo {
	MyChildThread m = new MyChildThread();
//	Thread thread = new Thread(m); thread.setName("ChildThread");
	
	Thread t = new Thread(m, "Child Thread");
	t.setPriority(10);
	t.start();
}
