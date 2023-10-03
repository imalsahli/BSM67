package com.test;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import com.cogent.NumberCalculation;

public class NumberCalculationTest {
	
	NumberCalculation nc;
	
	@BeforeEach
	void init() {
		nc = new NumberCalculation();
	}
	
	@Test
	void testAddition() {
		assertEquals(0, nc.add(10, 20), 30);
	}

	@Nested
	class AddTest {
		
		@Test
		void AddPossitive() {
			assertEquals(nc.add(1, 1), 2);
		}
		
		@Test
		void AddPossitive_Negative() {
			assertEquals(0, nc.add(1, -1));
		}
		
		
		@Test
		void AddNegative() {
			assertEquals(0, nc.add(1, -1));
		}
	}
	
	@Test
	void testMultiply() {
		assertAll(() -> assertEquals(0, nc.multiply(1, 0)), () -> assertEquals(7, nc.multiply(7, 1)),
				() -> assertEquals(20, nc.multiply(4, 5)));
	}
	
	@Test
	void testDivideWithException() {
		assertThrows(ArithmeticException.class, ()-> nc.divide(1, 1), "denominator should not be zero");
	}
	
	@Test
	void testDivideWithoutException() {
		assertEquals(nc.divide(1, 0), 1);
	}
}
