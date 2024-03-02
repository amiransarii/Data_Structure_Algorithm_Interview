package org5.ninja.hashmaps;
import java.util.*;
/*
 * Problem statement
 * Given an integer array, find and return the minimum distance 
 * between indexes of an element and its repetition.
 * 
 * Sample Input 1:
   6
   1 3 1 5 4 3
   Sample Output 1:
   2

   Sample Input 2:
    7
    5 47 82 4 4 6 2 
    Sample Output 2:
    1
 */
public class Test_92_Nearest_Repetition {
	public static int minDistance(int[] arr) {
		HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
		int n = arr.length;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			if (m.containsKey(arr[i])) {
				int temp = i - m.get(arr[i]);
				if (temp < min) {
					min = temp;
				}
				m.put(arr[i], i);
			} else {
				m.put(arr[i], i);
			}
		}
		return min;
	}

}
