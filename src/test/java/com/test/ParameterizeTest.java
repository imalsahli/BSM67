package com.test;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.demo.parameterize.Parameterize;

public class ParameterizeTest {
	
	@ParameterizedTest
	@ValueSource(strings= {"radar", "madam", "tacocat"})
	public void palindromTest(String input) {
		
		assertTrue(Parameterize.isPalindrom(input));
	}

}
