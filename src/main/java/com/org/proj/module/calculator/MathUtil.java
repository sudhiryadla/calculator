package com.org.proj.module.calculator;

public class MathUtil {

	public static String add(String first, String second) {
		return String.valueOf(Double.parseDouble(first) + Double.parseDouble(second));
	}
	
	public static String subtract(String first, String second) {
		return String.valueOf(Double.parseDouble(first) - Double.parseDouble(second));
	}
	
	public static String multiply(String first, String second) {
		return String.valueOf(Double.parseDouble(first) * Double.parseDouble(second));
	}
	
	public static String division(String first, String second) {
		return String.valueOf(Double.parseDouble(first) / Double.parseDouble(second));
	}
	
	public static String power(String first, String second) {
		return String.valueOf(Math.pow(Double.parseDouble(first), Double.parseDouble(second)));
	}
}
