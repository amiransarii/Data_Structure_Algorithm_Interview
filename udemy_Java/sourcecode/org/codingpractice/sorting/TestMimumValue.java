package org.codingpractice.sorting;

import java.util.Arrays;

/**
 * 
 he task is to find the minimum value of A[0] * B[0] + A[1] * B[1] +…+ A[N-1] * B[N-1],
  where shuffling of elements of arrays A and B is allowed
 *
 */
public class TestMimumValue {
	
	public static void main(String args[]) {
		
		int A[] = { 3, 1, 1 }; 
        int B[] = { 6, 5, 4 }; 
        int n = A.length; 
        minimumValue(A, B, n);
		
	}
	
	
	
	
	static void minimumValue(int[] arr1, int [] arr2,int n) {
		
		//sort two arrays
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		 int result = 0; 
		for(int i = 0 ; i < n ; i++) {
			
			result = result + arr1[i]*arr2[n-i-1];		//multiply min value of one array to amx value of other array
		}
		
		System.out.print(result);
		
		
		
	}

}
