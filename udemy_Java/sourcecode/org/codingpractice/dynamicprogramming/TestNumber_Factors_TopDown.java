package org.codingpractice.dynamicprogramming;

public class TestNumber_Factors_TopDown {
	
	private static int noOfWays(int n) {
		
		int[] dp = new int[n +1];
		return getNoOfWays(dp,n);
	}
	

	private static int getNoOfWays(int[]dp,int n) {

		// base cases
		if (n == 0 || n == 1 || n == 2) { // { }, {1}, {1,1}
			return 1;
		} else if (n == 3) {
			return 2; // {1,1,1}, {3}
		}

		if (dp[n] == 0) {

			int subtract1 = getNoOfWays(dp,n - 1); // if we subtract 1, we will be left with 'n-1'
			int subtract2 = getNoOfWays(dp,n - 3);// if we subtract 3, we will be left with 'n-3'
			int subtract3 = getNoOfWays(dp,n - 4);// if we subtract 4, we will be left with 'n-4'
			int add = subtract1 + subtract2 + subtract3;
			dp[n] = add;
			
		}
		return dp[n];
	}

	public static void main(String args[]) {

		System.out.println(noOfWays(4));
		System.out.println(noOfWays(5));
		System.out.println(noOfWays(6));
	}
}
