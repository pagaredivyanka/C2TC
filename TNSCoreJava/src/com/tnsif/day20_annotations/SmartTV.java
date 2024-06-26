package com.tnsif.day20_annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// for what we are creating annotation 
//examples -> class, interface, constructors, variables, Parameter, etc

@Target(ElementType.TYPE)  //TYPE -> interface
@Retention(RetentionPolicy.RUNTIME)
public @interface SmartTV {
	String os();
	int price() default 65000;
}
