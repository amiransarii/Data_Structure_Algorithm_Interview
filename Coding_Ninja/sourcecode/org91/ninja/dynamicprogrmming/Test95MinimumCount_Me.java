package org91.ninja.dynamicprogrmming;

public class Test95MinimumCount_Me {
	public static int minCount(int n) {
	int dp[]=new int[n+1];
    dp[0]=0;
    for(int i=1;i<= n;i++)dp[i]=i;  //initialize dp table
    for(int i=(int)Math.sqrt(n);i<=n;i++)
    {
      for(int j=1;j<=(int)Math.sqrt(i);j++)
      {
        dp[i]=Math.min(dp[i],1+dp[i-(j*j)]);
      }
    }
	return dp[n];
	}
}
