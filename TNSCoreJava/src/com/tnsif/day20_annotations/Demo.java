// annotations
//use -> to provide information(MetaData) to Compiler 
//used in development for checking the features are coming from right place or not

package com.tnsif.day20_annotations;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import com.tnsif.day01.*;

public class Demo {
	
//	we used annotation according to which 
	@SuppressWarnings("unchecked") //unchecked us used for method
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayList list = new ArrayList();
		list.add(10);
		list.add("Hello");
		
		System.out.println("------------------------------------------");
		
		AndroidSeries obj = new AndroidSeries("A23", 14);
		System.out.println(obj.model);
		System.out.println(obj.screenSize);
		
		Class c = obj.getClass();
		System.out.println("SmartTV details");
		Annotation an1 = c.getAnnotation(SmartTV.class);
		
		SmartTV s1 = (SmartTV) an1;
		
		System.out.println(s1.os());
		System.out.println(s1.price());
		
		
//		an1 -> get the information of SmartTV smartly and if there is no annotation the it gives 'Nun'
	}
}


