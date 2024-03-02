package org91.ninja.dynamicprogrmming;
/*
 * Problem statement
Given an array of n positive integers. The task is to count the 
number of Arithmetic Progression subsequences in the array. As the answer could be very large, output it modulo 100001.

Note: Empty sequence or single element sequence is Arithmetic Progression.

Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1 :
3
1 2 3
Sample output:
8
Sample Output Explanation:
Total subsequence are: {}, { 1 }, { 2 }, { 3 }, { 1, 2 }, { 2, 3 }, { 1, 3 }, { 1, 2, 3 }
Sample Input 2:
7
1 2 3 4 5 9 10
Sample Output:
37

 */
public class Test94NoOfAps {
	public static int numOfAP(int arr[], int N){
		int minElem = Integer.MAX_VALUE, maxElem = Integer.MIN_VALUE;
		for (int i = 0; i < N; i++){
		minElem = Math.min(minElem, arr[i]);
		maxElem = Math.max(maxElem, arr[i]);
		}
		int dp[] = new int[N+1];
		int totalAPs = N + 1;
		for (int d = (minElem-maxElem); d <= (maxElem-minElem); d++){
		int sum[] = new int[1001];
		for(int i = 0; i < 1001; i++)
		sum[i] = 0;
		for (int i = 0; i < N; i++){
		dp[i] = 1;
		if (arr[i] - d >= 1 && arr[i] - d <= 1000)
		dp[i] += sum[arr[i] - d];
		totalAPs += (dp[i] - 1) % 100001;
		sum[arr[i]] += dp[i];
		}
		}
		return totalAPs % 100001;
		}
}
