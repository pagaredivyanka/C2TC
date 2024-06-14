package com.tnsif.day16;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb;
		
		String s = "Hello";
		sb = new StringBuffer(s);
		
		sb = new StringBuffer("Hello");
		System.out.println(sb);
		
		sb.append("! How are you? ");
		System.out.println("append --> ! How are you? : " + sb);
		
		sb.replace(0, 5, "Hii..");
		System.out.println("Replace 'Hello' --> Hii.. : " + sb);  //replace index (0 - 5) with Hii..
		
		sb.reverse();
		System.out.println("reverse sb : " + sb);  //reverse string 
		sb.reverse();
		System.out.println("again reverse gives original stringBuffer: " + sb);  //again reverse it gives original string
		
		s = sb.toString();  //reverse using to toString
		System.out.println("s points to (sb.toString()) : " + s);  
		
		
	}
}
