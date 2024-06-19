package com.tnsif.day08_interface;

public class GreetDemo {
	
	public static void main(String[] args) {
		
		GreetImp o = new GreetImp();
		System.out.println(o.sayHello("Divyanka"));
		
		GreetImp2 o2 = new GreetImp2();
		System.out.println(o2.sayHello("Ritesh"));
		
//		Using Lambda Expression
		IGreet io = (name)->"Hi" + name;
		System.out.println(io.sayHello("Rama"));
		
//		Or
		io = (name)->{
			return ("Good Morning" + name);
		};
		System.out.println(io.sayHello("Rinku"));
	}
}
