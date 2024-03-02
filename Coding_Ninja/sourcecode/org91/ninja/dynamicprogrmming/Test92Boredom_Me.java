package org91.ninja.dynamicprogrmming;

public class Test92Boredom_Me {
	/**
     * This array stores the frequency(int[] freq) and maximum points(dp) of each integer in the input array.
     * It is initialized with a size of 1002 to accommodate integers from 1 to 1000.
     */
	public static int[] freq = new int[1002], dp = new int[1002];


	 public int max(int a, int b) {
		/**
     * This function returns the maximum of two numbers.
     * It is a helper function used in the `solve` function.
     *
     *  a The first number.
     *  b The second number.
     *  The maximum of a and b.
     */
        return a < b ? b : a;
    }

	public int solve(int n,int A[])
	{
	
		// if(A.length == 0)
		// return 0;

		// if(A.length == 1)
		// return A[0];

		// if(A.length == 2)
		// return A[1];


	//   int[] dp = new int[n];
	//   dp[0] = A[0];
	//   dp[1] =  A[1];

	 
        for (int i = 0; i < n; i++) {
            freq[A[i]]++; // count the frequency of each integer
        }
        dp[1] = freq[1]; // Initialize the dp array to store the maximum points achievable when the highest integer removed is 1.

		// Fill the dp array using dynamic programming.
        // The idea is to consider two cases for each integer i:
        // 1. Do not remove i: In this case, the maximum points achievable are the same as the previous integer (dp[i-1]).
        // 2. Remove i: In this case, the maximum points achievable are the points obtained by removing the previous integer (dp[i-2]) plus the points awarded for removing i (i * freq[i]).
        // We take the maximum of these two cases and store it in dp[i].
        for (int i = 2; i <= 1000; i++) {
            dp[i] = max(dp[i - 1], dp[i - 2] + i * freq[i]);
        }

		// Return the maximum points achievable, which is stored in dp[1000] since we consider integers up to 1000.
        return dp[1000];
        
    }
}
