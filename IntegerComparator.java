package com.svinfotech.datastructures;

import java.util.Comparator;

public class IntegerComparator implements Comparator<Integer> {
	
	public static int i=0;
	
	@Override
	public int compare(Integer a, Integer b) {
		System.out.println(++i);
		return a-b;
	}

}
