package org5.ninja.hashmaps;

import java.util.HashMap;

/*Problem statement
You are given an array of integers that contain numbers in random order. 
Write a program to find and return the number which occurs the maximum times in the given input.
If two or more elements are having the maximum frequency, return the element which occurs in the array first.
 */

/*
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * where n is the size of the input
 */
public class Test_3_MaximumFrequncyNumber {
	
	public static int maxFrequencyNumber(int[] arr) {
		HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();
		
		for(int i: arr) {
			if(hm.containsKey(i)) {
				hm.put(i, hm.get(i)+1);
			}
			else {
				hm.put(i, 1);
			}
		}
		
		int max =0, ans = Integer.MIN_VALUE;
		for(int i: arr) {
			if(hm.get(i)> max) {
				max = hm.get(i);
				ans = i;
			}
		}
		return ans;
	}

}
