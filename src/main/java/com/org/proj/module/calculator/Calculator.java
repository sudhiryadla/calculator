package com.org.proj.module.calculator;

import java.util.Stack;

/**
 * Class to calculate arithmetic expression.
 * @author Sudhir
 *
 */
public class Calculator {

	private static String OPERATORS = "/*+-^";
	/**
	 * Method to evaluate given arithmetic expression
	 * @param input
	 * @return result
	 */
	public double calculate(String input) {
		double result = 0;
		if(input == null || input.trim().length() == 0) {
			return result;
		}
		
		if(input.length() == 1 && !isOperator(input.charAt(0))){
			return Double.parseDouble(input);
		}
		Stack<String> stack = new Stack<String>();
		char[] chars = input.toCharArray();
		
		for (int i = 0; i < chars.length; i++) {
			if(isOperator(chars[i])) {
				if(chars[i] == '^') {
					stack.push(MathUtil.power(stack.pop(), String.valueOf(chars[++i])));
					continue;
				}
				else if(chars[i] == '/') {
					stack.push(MathUtil.division(stack.pop(), String.valueOf(chars[++i])));
					continue;
				}
				else if(chars[i] == '*') {
					stack.push(MathUtil.multiply(stack.pop(), String.valueOf(chars[++i])));
					continue;
				}
				
			}
			stack.push(String.valueOf(chars[i]));
		}
		
		String res = null;
		for (int i = 0; i < stack.size(); i++) {
			if(i==0){
				res = stack.get(i);
			}
			if("+".equals(stack.get(i))) {
				res = MathUtil.add(res, stack.get(i+1));
				i++;
			} 
			if("-".equals(stack.get(i))) {
				res = MathUtil.subtract(res, stack.get(i+1));
				i++;
			}
		}
		stack.removeAllElements();
		return Double.parseDouble(res);
	}
	
	/**
	 * Returns true if it is an operator(/,*,_,-,^) else false
	 * @param element character from given input
	 * @return true if it is operator in else false
	 */
	public boolean isOperator(char element) {
		return OPERATORS.contains(String.valueOf(element));
	}
	
	
	public boolean isOperator(String element) {
		return OPERATORS.contains(element);
	}
	
}
