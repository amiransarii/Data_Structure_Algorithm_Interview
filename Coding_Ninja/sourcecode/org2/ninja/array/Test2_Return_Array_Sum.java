package org2.ninja.array;
/**
 * Problem statement
 * Given an array/list(ARR) of length N, you need to find and return the sum of all the elements in the array/list.
 * 
 * Detailed explanation ( Input/output format, Notes, Images )
 * Constraints :
 * 1 <= t <= 10^2
 * 0 <= N <= 10^5

Time Limit: 1sec
Sample Input 1:
1
3
9 8 9
Sample Output 1:
26


Sample Input 2:
2
5
1 2 3 4 5 
3
10 20 30 
Sample Output 2:
15
60
 * 
 *
 */
public class Test2_Return_Array_Sum {
	public static int sum(int[] arr) {
		int ans = 0;
		for(int i = 0; i < arr.length; i++) {
		ans += arr[i];
		}
		return ans;
		}

}
