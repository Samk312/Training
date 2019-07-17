package com.svinfotech.datastructures;

import java.util.Collections;

public class BubbleSort {
	// 1. 
	public static void main(String[] args) {
		Integer a[] = {12,27,9,4,22};
		
		/*
		 // Loop 1
		 1. Iteration 1: It will compare 1st and 2nd elements, 
		    least one it will put at 1st position and greatest one it will put at 2nd position.
		2. Iteration 2: It will compare 2nd and 3rd elements, 
		least one it will put at 2nd position and greatest one it will put at 3rd position.
		3. Like this if we have n elements (n-1) times it will iterate .
		 After end of the first loop, highest number will be placed at last index.
		4. Now again we will start iterating in 2nd loop, till we find the second largest number.
		*/
		Integer temp;
		System.out.println("Before BubbleSort : ");
		
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		boolean flag = false;
		
		while (flag == false) {
			flag = true;
			for (int i=0; i<a.length-1; i++) {
				if (a[i] > a[i+1]) {
					temp = a[i+1];
					a[i+1] = a[i];
					a[i] = temp;
					flag = false;
				}
			}
		}
		
		System.out.println("After BubbleSort : ");
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

}
