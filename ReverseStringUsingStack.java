package com.svinfotech.datastructures;

import java.util.Stack;

public class ReverseStringUsingStack {
	
	public static void main(String[] args) {
		System.out.println("Original : Varun && Reverse : " + reverseUsingStack("Varun"));
		
		System.out.println("Original : Varun && Reverse : " + reverseUsingCharArray("Varun"));
	}
	
	public static String reverseUsingStack(String original) {
		
		Stack stack = new Stack();
		System.out.println(stack.capacity());
		for (int i = 0; i < original.length(); i++) {
			stack.push(original.charAt(i));
		}
		StringBuffer sb = new StringBuffer();
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		
		return sb.toString();
	}
	
	public static String reverseUsingCharArray(String original) {
		StringBuffer sb = new StringBuffer();
		char[] charArray = original.toCharArray();
		for (int i=charArray.length-1; i>=0; i--) {
			sb.append(charArray[i]);
		}
		
		return sb.toString();
		
	}

}
