package org91.ninja.dynamicprogrmming;

public class Test8NoOfBST_UsingDP_Me {
	public static int balancedBTs(int n){
	      int MOD = 1000000007;
	      long [] dp = new long[(int) (n+1)];

		  //base case
		  dp[0] = 1;
		  dp [1] = 1;

		  for(int i = 2; i <=n; ++i)
			  dp[i] = (dp[i - 1] * ((2 * dp [i - 2])% MOD + dp[i - 1]) % MOD) % MOD;
		  
		return (int) dp[ n];
			

		}
	}
