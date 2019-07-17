package com.svinfotech.datastructures;

import java.util.Stack;
import java.util.StringTokenizer;

public class EvaluateInfix {
	
	public static void main(String[] args) {
		String s = "(25+((56*3)-2))";
		int finalResult = evaluate(s);
		System.out.println("Expression : " + s + ", Result : " + finalResult);
	}
	
	public static int evaluate(String inputValue) {
		Stack stack = new Stack();
		StringTokenizer tokens = new StringTokenizer(inputValue, "{}()*+/-", true);
		while (tokens.hasMoreTokens()) {
			String nextToken = tokens.nextToken();
			if (nextToken.equals("{") || nextToken.equals("(") 
					|| nextToken.matches("[0-9]+") || nextToken.equals("+") 
					|| nextToken.equals("*") || nextToken.equals("/") 
					|| nextToken.equals("%") || nextToken.equals("-")) {
				stack.push(nextToken);
			} else if (nextToken.equals("}") || nextToken.equals(")")) {
				int operand2 = Integer.parseInt(stack.pop().toString());
				//int operand2 = (Integer)stack.pop();
				String operator = (String)stack.pop();
				int operand1 = Integer.parseInt(stack.pop().toString());
				//int operand1 = (Integer)stack.pop();
				if(!stack.isEmpty()){
                    stack.pop(); // This is to delete the starting brace or parenthis
                }
				
				int result = 0;
				if (operator.equals("*")) {
					result = operand1 * operand2;
				} else if (operator.equals("/")) {
					result = operand1 / operand2;
				} else if (operator.equals("+")) {
					result = operand1 + operand2;
				} else if (operator.equals("-")) {
					result = operand1 - operand2;
				}
				stack.push(result);
			}
		}
		int finalResult = (Integer)stack.pop();
		return finalResult;
	}

}
