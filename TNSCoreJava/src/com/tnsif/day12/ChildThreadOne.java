package com.tnsif.day12;

public class ChildThreadOne {

	public static void main(String[] args) {
		public ChildThreadOne() {}
		
		public ChildThreadOne(String name) {
			
		}
		
		public void run() {
			try {
				MyTask.sayHello(10);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
		

}
