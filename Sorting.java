package com.svinfotech.datastructures;

import java.util.Arrays;
import java.util.Collections;

public class Sorting {
	
	public static void main(String[] args) {
		Integer a[] = {12,27,9,4,22};
		
		System.out.println("Before Sorting : ");
		for (int i=0; i<a.length; i++) {
			System.out.println(a[i] + "\t");
		}
		
		// 1. Sorting using Arrays.sort
		Arrays.sort(a);
		System.out.println("After Sorting");
		
		for (int i=0; i<a.length; i++) {
			System.out.println(a[i] + "\t");
		}
		
		// 2. Sorting using collections 
		//Collections.sort();
		
		
	}

}
