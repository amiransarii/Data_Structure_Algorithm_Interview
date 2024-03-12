package org92.ninja.dynamicprogrmming;
/*
 * Problem statement
A thief is robbing a store and can carry a maximal weight of W into his knapsack. 
There are N items and ith item weighs wi and is of value vi. Considering the constraints 
of maximum weight that knapsack can carry, 
you have to find and return the maximum value that thief can generate by stealing items.

Note
Space complexity should be O(W).
Detailed explanation ( Input/output format, Notes, Images )
Constraints
1 <= N <= 10^4
1<= wi <= 100
1 <= vi <= 100
Time Limit: 1 second
Sample Input 1 :
4
1 2 4 5
5 4 8 6
5
Sample Output 1 :
13
 */

/*
Time complexity: O(N * W)
Space complexity: O(W)
where N is the number of items
and W is the maximum weight that the theif can carry
*/

public class Test6Knapsack {
	static int knapsack(int[] weight, int[] value, int n, int maxWeight) {
		int[][] dp = new int[2][maxWeight + 1];
		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= maxWeight; ++j) {
				if (weight[i] <= j) {
					dp[i % 2][j] = Math.max(value[i] + dp[(1 + i) % 2][j - weight[i]], dp[(i + 1) % 2][j]);
				} else {
					dp[i % 2][j] = dp[(i + 1) % 2][j];
				}
			}
		}
		return dp[(n + 1) % 2][maxWeight];
	}
}
