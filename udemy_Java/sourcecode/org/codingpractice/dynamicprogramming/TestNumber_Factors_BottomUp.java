package org.codingpractice.dynamicprogramming;

public class TestNumber_Factors_BottomUp {
	
	public int waysToGetN(int n) {
		
		int []dp = new int[n +1];
		dp[0] = 1;
		dp[1] = 1;
		dp[2] = 1; //base case
		dp[3] = 2; //base case
		
		
		for(int i = 4 ; i <= n ; i++) {
			dp[i] = dp[i - 1] + dp[i - 3 ] + dp[i - 4];
		}
		
		return dp[n];
	}
	
	public static void main(String[] args) {
		TestNumber_Factors_BottomUp en = new TestNumber_Factors_BottomUp();
		System.out.println(en.waysToGetN(4));
		System.out.println(en.waysToGetN(5));
		System.out.println(en.waysToGetN(6));
	}// End of method

}
