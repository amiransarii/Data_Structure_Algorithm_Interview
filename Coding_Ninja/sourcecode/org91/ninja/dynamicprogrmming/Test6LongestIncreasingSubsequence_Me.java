package org91.ninja.dynamicprogrmming;

public class Test6LongestIncreasingSubsequence_Me {
	 public static int lis(int arr[]) {
	        
	       return lis(arr, arr.length);

	    }

	     public static int lis(int[] input, int n) {

	        int[] dp = new int[n];
	        dp[0] = 1;

	        for (int i = 1; i < n; i++) {
	            dp[i] = 1;

	            for (int j = i - 1; j >= 0; j--) {
	                if (input[j] < input[i]) {
	                    int possibleAns = dp[j] + 1;
	                    if (possibleAns > dp[i]) {
	                        dp[i] = possibleAns;
	                    }
	                }
	            }
	        }

	        int best = 0;

	        for (int i = 0; i < n; i++) {
	            if (best < dp[i]) {
	                best = dp[i];
	            }
	        }
	        return best;
	    
	}
}
