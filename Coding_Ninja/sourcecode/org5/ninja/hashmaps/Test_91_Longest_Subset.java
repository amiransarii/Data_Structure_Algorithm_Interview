package org5.ninja.hashmaps;
import java.util.*;

/*
 * Problem statement
 * Given an array, find and return the length of longest subarray containing equal number of 0s and 1s.
 * 
 * Sample Input 1 :
 * 6 
 * 1 0 0 1 1 1
 * Sample Output 1 :
 * 4    
 * 
 * Sample Input 2 :
 * 10 
 * 1 1 1 0 0 0 1 1 0 0
 * Sample Output 2 :
 * 10
 */
public class Test_91_Longest_Subset {
	public static int max(int[] arr) {
		int n = arr.length;
		HashMap<Integer, Integer> m = new HashMap<Integer, Integer>(); // Key:sum Value: index;
		m.put(0, -1); // Add an element represnting sum=0 and index=-1
		int ans = 0;
		int sum = 0;
		// Trick: replace all zeores with -1 and find largest sub array with sum=0
		for (int i = 0; i < n; i++) {
			if (arr[i] == 0) {
				arr[i] = -1;
			}
		}
		for (int i = 0; i < n; i++) {
			sum = sum + arr[i];
			if (m.containsKey(sum)) {
				if (ans < i - m.get(sum)) {
					ans = i - m.get(sum);
				}
			} else {
				m.put(sum, i);
			}
		}
		return ans;
	}

}
