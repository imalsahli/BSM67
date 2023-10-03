package com.test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cogent.CaseConverter;

public class CaseConverterTest {
	
CaseConverter cc;

	
	@BeforeEach
	void init() {
		cc = new CaseConverter();
	}
	
	@Test
	void testNullString() {
		assertEquals("", cc.convertCase(null));
	}
	
	@Test
	void testEmptyString() {
		assertEquals("", cc.convertCase(""));
	}
	
	@Test
	void testOneNumberPresent() {
		assertEquals("8", cc.convertCase("8"));
	}
	
	@Test
	void testStringToUppercase() {
		assertEquals("TEST", cc.convertCase("test"));
	}

}
