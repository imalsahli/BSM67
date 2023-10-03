package com.demo.parameterize;

public class Parameterize {
	
	public static boolean isPalindrom(String str) {
		return new StringBuffer(str).reverse().toString().equals(str);
	}

}

//radar, madam, tacocat