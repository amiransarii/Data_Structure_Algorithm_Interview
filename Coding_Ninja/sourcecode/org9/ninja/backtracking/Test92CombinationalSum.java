package org9.ninja.backtracking;
import java.util.*;
/**
 * Given an array of integers A and an integer B. Find and return all unique combinations in A where the sum of elements is equal to B.

Elements of input array can be repeated any number of times.

One combination should be saved in increasing order. Order of different combinations doesn't matter.

Note : All numbers in input array are positive integers.
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1<= N <=1000

Sample Input 1 :
4
7 2 6 5
16
Sample Output 1 :

Explain
2 2 2 2 2 2 2 2 
2 2 2 2 2 6 
2 2 2 5 5 
2 2 5 7 
2 2 6 6 
2 7 7 
5 5 6
Sample Input 2 :
4
2 4 6 8
8
Sample Output 2 :
2 2 2 2 
2 2 4 
2 6 
4 4 
8 
 * 
 *
 */
public class Test92CombinationalSum {
	public static ArrayList<ArrayList<Integer>> combinationSum(int[] arr, int sum) {
		Arrays.sort(arr);
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		Arrays.sort(arr);
		int[] temp = new int[arr.length];
		int j = 0;
		for (int i = 0; i < arr.length - 1; i++)
			if (arr[i] != arr[i + 1])
				temp[j++] = arr[i];
		temp[j++] = arr[arr.length - 1];
		arr = new int[j];
		for (int i = 0; i < j; i++)
			arr[i] = temp[i];
		backTrack(result, list, arr, sum, 0);
		return result;
	}

	private static void backTrack(ArrayList<ArrayList<Integer>> res, ArrayList<Integer> tempList, int[] arr, int sum,
			int index) {
		if (sum < 0)
			return;
		else if (sum == 0)
			res.add(new ArrayList<Integer>(tempList));
		else {
			for (int i = index; i < arr.length; i++) {
				tempList.add(arr[i]);
				backTrack(res, tempList, arr, sum - arr[i], i);
				tempList.remove(tempList.size() - 1);
			}
		}
	}
}
