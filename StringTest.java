package com.svinfotech.datastructures;

public class StringTest {
	
	public static void main(String[] args) {
		String s = "25+56*3-2";
		
		char c[] = s.toCharArray();
		int a[] = new int[c.length];
		for (int i=0 ; i < c.length ; i++) {
			int b = (int) c[i];
			System.out.println(b);
		}
	}

}
