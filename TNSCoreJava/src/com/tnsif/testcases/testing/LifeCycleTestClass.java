//test instance of a class is created for each method 

// static key word is associated with class which we can use/apply for each method automatically 
// by only creating object for only class, it shows same Hash code for each method

// One instance for all test methods

package com.tnsif.testcases.testing;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

//@Disabled
@TestInstance(Lifecycle.PER_CLASS) //by default
public class LifeCycleTestClass {
	
//	@Test
	@RepeatedTest(2)
	public void testMethodOne() {
		System.out.println("This is Test Method One" + this);
	}
	
//	@Test
	@RepeatedTest(2)
	public void testMethodTwo() {
		System.out.println("This is Test Method Two" + this);
	}
	
	@BeforeAll
//	public static beforeAllLifeCycleMethod() {
	public void beforeAllLifeCycleMethod() {
		System.out.println("Before All");
	}
	
	@AfterAll
//	public static afterAllLifeCycleMethod() {
	public void afterAllLifeCycleMethod() {
		System.out.println("After All");
	}
	
	@BeforeEach
	public void beforeEachLifeCycleMethod() {
		System.out.println("Before Each");
	}
	
	@AfterEach
	public void afterEachLifeCycleMethod() {
		System.out.println("After Each");
	}
	
}
