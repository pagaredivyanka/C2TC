//test instance of a class is created for each method 

// static key word is associated with class which we can use/apply for each method automatically 
// by only creating object for only class

package com.tnsif.testcases.testing;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class LifeCycleTestClass {
	
	@Test
	public void testMethodOne() {
		System.out.println("This is Test Method One");
	}
	
	@Test
	public void testMethodTwo() {
		System.out.println("This is Test Method Two");
	}
	
	@BeforeAll
	public void beforeAllLifeCycleMethod() {
		System.out.println("Before All");
	}
	
	@AfterAll
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
