package org.codingpractice.sorting;

import java.util.Arrays;

/**
 * Given an array with all elements greater than or equal to zero. Return the maximum product of two numbers possible
 *
 */
public class TestMaximumProducts {
	
	public static void main(String args[]) {
		
		int[] arr = {1, 100, 42, 4, 23};
		
		int length = arr.length;
		//sort array
		Arrays.sort(arr); // ascending order
		
		int lastElement = arr[length -1];
		int secondLastElement = arr[length -2];
		
		int result = lastElement*secondLastElement;
		
		System.out.println(result);
		
		
	}
	
	
	

}
