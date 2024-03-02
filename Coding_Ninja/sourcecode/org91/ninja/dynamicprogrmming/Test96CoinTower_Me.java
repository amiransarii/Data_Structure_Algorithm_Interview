package org91.ninja.dynamicprogrmming;

public class Test96CoinTower_Me {
	public static String findWinner(int n, int x, int y) {
		boolean [] dp = new boolean[n + 1];

	    dp[0] = false;
	    dp[1] = true;

	    for (int i = 2; i <= n; i++)
	    {
	        if (i - 1 >= 0 && !dp[i - 1])
	            dp[i] = true;
	        else if (i - x >= 0 && !dp[i - x])
	            dp[i] = true;
	        else if (i - y >= 0 && !dp[i - y])
	            dp[i] = true;
	        else
	            dp[i] = false;
	    }

	    if (dp[n])
	        return "Beerus";
	    else
	        return "Whis";
		}

}
