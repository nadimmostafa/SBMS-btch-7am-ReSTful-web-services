package org.nadim.math;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BasicMathTest {
	
	BasicMath bm = null;
	int expectedResult;
	
	@BeforeEach
	public void setUp() {
		bm = new BasicMath();
		expectedResult = 30;
	}
	
	@Test
	public void testAdd() {
		Integer result = bm.add(20, 10);
		assertEquals(expectedResult, result);
	}
	
	@Test
	public void testIsEven() {
		boolean result2 = bm.isEven(10);
		assertTrue(result2);
	}
	
	@AfterEach
	public void clean() {
		bm = null;
	}
}
