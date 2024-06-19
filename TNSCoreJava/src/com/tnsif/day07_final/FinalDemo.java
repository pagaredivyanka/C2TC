package com.tnsif.day07_final;

public class FinalDemo {
	public static void main(String[] args) {
		UsingFinal obj = new UsingFinal();
		System.out.println(obj);
		
		UsingFinal obj1 = new UsingFinal(5);
		System.out.println(obj1);
		
		UsingFinal obj2 = new UsingFinal(100);
		System.out.println(obj2);
	}
	
	final class ClassA {
		public ClassA() {
			System.out.println("This is final class");
		}
	}
	
//	can't create child class from final ClassA
	
	class ClassX {
		public void show() {
			System.out.println("show() in ClassX");
		}
		
//		final method can't be override
	/*
	*  		public final void display() {
	*		System.out.println("display() in ClassX");
	*	}
	*/
		
	}
}
