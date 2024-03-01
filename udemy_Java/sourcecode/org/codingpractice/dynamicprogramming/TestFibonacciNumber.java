package org.codingpractice.dynamicprogramming;

/**
 * 
 * @author amir.ansari
 * get the nth fibonacci Number
 */
public class TestFibonacciNumber {
	
	private static int getFiboNumber(int n) {
		
		int[] dp = new int[n +1];
		
		if(n == 1 || n == 2) {
			return n - 1;
		}
		
		if(dp[n] == 0) {
			dp[n] = getFiboNumber(n -1) + getFiboNumber(n - 2);
		}
		
		return dp[n];
		
	}
	
	public static void main(String args[]) {
		
		int result = getFiboNumber(8);
		System.out.println(result);
	}
	

}
