package com.tnsif.testcases.testing;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import com.tnsif.testcases.businesslogic.Operations;

public class TestClassOne {
	
	@ParameterizedTest
	@CsvSource({"4, 24", "5, 120", "0, 1", "-4, -1"})   //multiple values
	
	public void testFactorial(int n, long expected) {
		long actual = Operations.getFactorial(n);
		Assertions.assertEquals(expected, actual);
	}
	
	@ParameterizedTest
	@ValueSource(ints = {5, 9, 13, 7}) //single value
	public void testfactorPrimeNumber(int n) {
		assertTrue(Operations.isPrime(n));
	}
}
