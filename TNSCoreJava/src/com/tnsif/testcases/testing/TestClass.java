//
//to annotate that the method is annotated then we have to written under @Test
//if actual value = expected value then -> test case is 'pass'
//it used Assertions
// Assertion is True then test case is Pass
// Assertion is false then test case is false

package com.tnsif.testcases.testing;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import com.tnsif.testcases.businesslogic.Operations;

public class TestClass {
	@Test
	public void testAddition() {
		System.out.println("Addition Testing");
		int expected = 7;
		int actual = Operations.add(2, 5);
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void testFactorial() {
		System.out.println("factorial Testing");
		long expected = 5040;
		long actual = Operations.getFactorial(7);
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void testFactorialForZero() {
		System.out.println("factorial testing");
		long expected = 1;
		long actual = Operations.getFactorial(0);
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void testFactorialForNegativeNumber() {
		System.out.println("factorial testing");
		long expected = -1;
		long actual = Operations.getFactorial(-6);
//		long actual = Operations.getFactorial(-6);   //there is no factorial for -ve no we get -1
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void testForPrime() {
		Assertions.assertTrue(Operations.isPrime(5));
	}
	
	@Test
	public void testForNonPrime() {
		Assertions.assertFalse(Operations.isPrime(9));
	}
	
	@Test
	public void testForNumberPalindrome() {
		Assertions.assertTrue(Operations.isPalindrome(121));
	}
	
	@Test
	public void testForNumberNonPalindrome() {
		Assertions.assertFalse(Operations.isPalindrome(123));
	}
	
	@Test
	public void testForStringPalindrome() {
		Assertions.assertTrue(Operations.isPalindrome("CAC"));
	}
	
	@Test
	public void testForStringNonPalindrome() {
		Assertions.assertFalse(Operations.isPalindrome("CAR"));
	}
}
