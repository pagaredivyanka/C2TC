//for dynamic test we can't use Test annotation needs to annotation need to annotate with TestFactory

package com.tnsif.testcases.testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import com.tnsif.testcases.businesslogic.Operations;

public class testClassTwo {
	
	@TestFactory  //for dynamic test annotation
	public DynamicTest testMethod() {
		return DynamicTest.dynamicTest( "First Dynamic Test", () -> {Assertions.assertTrue(Operations.isPalindrome(121));});   //to change name {4, 24}, { , }, .....
	}
	
	@TestFactory
	public List<DynamicTest> testMethodTwo() {
		
		List<DynamicTest> tests = new ArrayList<DynamicTest>();
		
		tests.add(DynamicTest.dynamicTest("TestForFactorial", () -> {Assertions.assertEquals(24, Operations.getFactorial(4));}));
		tests.add(DynamicTest.dynamicTest("TestForPrime", () -> {Assertions.assertTrue((Operations.isPrime(3)));}));
		tests.add(DynamicTest.dynamicTest("TestForNull", () -> {Assertions.assertNull(null);}));
		tests.add(DynamicTest.dynamicTest("TestForFalse", () -> {Assertions.assertFalse(12>50);}));
		return tests;
		
	}
		
		
		@TestFactory
		public List<DynamicTest> testMethodThree() {
			return Arrays.asList(
					DynamicTest.dynamicTest("TestForFactorial", () -> {Assertions.assertEquals(24, Operations.getFactorial(4));}),
			DynamicTest.dynamicTest("TestForPrime", () -> {Assertions.assertTrue((Operations.isPrime(3)));}),
			DynamicTest.dynamicTest("TestForNull", () -> {Assertions.assertNull(null);}),
			DynamicTest.dynamicTest("TestForFalse", () -> {Assertions.assertFalse(12>50);})
				
				);
				
	}
}
