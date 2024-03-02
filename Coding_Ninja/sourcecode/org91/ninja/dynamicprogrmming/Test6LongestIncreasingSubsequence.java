package org91.ninja.dynamicprogrmming;
/*
 * Problem statement
Given an array with N elements, you need to find the length of the longest 
subsequence in the given array such that all elements of the subsequence are sorted in strictly increasing order.

Detailed explanation ( Input/output format, Notes, Images )
Constraints
1 <= N <= 10^3
Time Limit: 1 second
Sample Input 1 :
6
5 4 11 1 16 8
Sample Output 1 :
3
Sample Output Explanation
Length of longest subsequence is 3 i.e. (5,11,16) or (4,11,16).
Sample Input 2 :
3
1 2 2
Sample Output 2 :
2
 */
/*
Time complexity: O(N^2)
Space complexity: O(N)
where N is the size of the input array
*/
public class Test6LongestIncreasingSubsequence {
	public static int lis(int arr[]) {
		int storage[] = new int[arr.length];
		storage[0] = 1;
		int ans = 1;
		for(int i = 1; i < storage.length; i++) {
		int max = 1;
		for(int j = i - 1; j >= 0; j--) {
		if(arr[j] < arr[i]) {
		int op = storage[j] + 1;
		if(op > max) {
		max = op;
		}
		}
		}
		storage[i] = max;
		if(max > ans) {
		ans = max;
		}
		}
		return ans;
		}
}
