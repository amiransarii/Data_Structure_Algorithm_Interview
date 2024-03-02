package org5.ninja.hashmaps;

import java.util.*;
/**
 * 
 * Problem statement
 * Given a random integer array A of size N. Find and print the count of 
 * pair of elements in the array which sum up to 0.
 * Note:
 * Array A can contain duplicate elements as well.
 * 
 * Sample Input 1:
   5
   2 1 -2 2 3
   Sample Output 1:
    2
    Explanation
    (2,-2) , (-2,2) will result in 0 , so the answer for the above problem is 2.
 */
 
/**
 * 
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 * Where N is the size of the input array
 */
public class Test_5_Pair_Sum_Zero {
	
	public static int PairSum(int [] input, int size) {
		HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
		
		int finalCount = 0;
		for(int i = 0; i < size; i++) {
			
			int key = input[i];
			if(h.containsKey(key)) {
				int value = h.get(key);
				h.put(key, value+1); //increment frequency value by 1 if key is already exist
			}
			else {
				h.put(key,1);
			}
		}
		
		//traversing the array and checking if key is present 
		for(int i = 0; i < size; i++) {
			int key = input[i];
			
			if(h.containsKey(-key) && h.get(key)!= 0) {
				int times;
				
				if(key == (-key)) {
					//True in case of zero
					int occurences = h.get(key);
					times = (occurences*(occurences-1))/2; // For example, 0 0 0 0 0 -> n*(n-1)/2
					h.put(key, 0);
					continue;
					
				}
				times = h.get(key)*h.get(-key);
				finalCount = finalCount + times;
				h.put(key, 0);
				h.put(-key, null);
			}
		}
		return finalCount;
	}

}
