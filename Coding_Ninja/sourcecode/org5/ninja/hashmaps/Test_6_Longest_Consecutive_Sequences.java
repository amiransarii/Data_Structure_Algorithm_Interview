package org5.ninja.hashmaps;
import java.util.Map; 
import java.util.HashMap; 
import java.util.ArrayList;
/*
 * Problem statement
You are given an array of unique integers that contain numbers in random order. 
You have to find the longest possible sequence of consecutive numbers using 
the numbers from given array.

You need to return the output array which contains starting and ending element. 
If the length of the longest possible sequence is one, then the output 
array must contain only single element.

Note:
1. Best solution takes O(n) time.
2. If two sequences are of equal length, then return the sequence 
starting with the number whose occurrence is earlier in the array.

Sample Input 1 :
13
2 12 9 16 10 5 3 20 25 11 1 8 6 
Sample Output 1 :
8 12 
Explanation:The longest consecutive sequence here 
is [8, 9, 10, 11, 12]. So the output is the start and end of this sequence: [8, 12].
*/
public class Test_6_Longest_Consecutive_Sequences {
	public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
		Map<Integer, Boolean> vis = new HashMap<>();
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			map.put(num, i);
			if (!vis.containsKey(num)) {
				vis.put(num, false);
			}
		}
		ArrayList<Integer> ls = new ArrayList<>();
		int globalMaxSequenceLength = 1;
		int globalMinStartIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			int currentMinStartIndex = i;
			int count = 0;
			int tempNum = num;
			// Forward
			while (vis.containsKey(tempNum) && !vis.get(tempNum)) {
				vis.put(tempNum, true); // Mark Visited elements in the array as true
				count++;
				tempNum++;
			}
			// Backward
			tempNum = num - 1;
			while (vis.containsKey(tempNum) && !vis.get(tempNum)) {
				vis.put(tempNum, true); // Mark Visited elements in the array as true
				count++;
				currentMinStartIndex = map.get(tempNum);
				tempNum--;
			}
			if (count > globalMaxSequenceLength) {
				globalMaxSequenceLength = count;
				globalMinStartIndex = currentMinStartIndex;
			} else if (count == globalMaxSequenceLength) {
				if (currentMinStartIndex < globalMinStartIndex) {
					globalMinStartIndex = currentMinStartIndex;
				}
			}
		}
		int globalStartNum = arr[globalMinStartIndex];
		ls.add(globalStartNum);
		if (globalMaxSequenceLength > 1) {
			ls.add(globalStartNum + globalMaxSequenceLength - 1);
		}
		return ls;
	}
}
