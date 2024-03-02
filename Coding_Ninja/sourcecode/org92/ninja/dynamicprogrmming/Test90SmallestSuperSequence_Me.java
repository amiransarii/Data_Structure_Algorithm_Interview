package org92.ninja.dynamicprogrmming;

public class Test90SmallestSuperSequence_Me {
	public static int smallestSuperSequence(String str1, String str2) {

        int[][] dp = new int[str1.length() + 1][str2.length() + 1];
        
        for(int i = 0; i < dp.length; ++i){
            for(int j = 0; j < dp[i].length; ++j){
                dp[i][j] = -1;
            }
        }
        
    	return SSShelper(str1, str2, 0, 0, dp); //SSS == smallestSuperSequence.//0, 0 means startIndex 0f str1 is 0, also, startIndex of str2 is 0

        
}

private static int SSShelper(String str1, String str2, int i, int j, int[][] dp) { //i and j represent startIndex of Strings str1 and str2 respectively

        //base case
        if (i == str1.length()){
            return str2.length() - j;
        }
    	if (j == str2.length()){
            return str1.length() - i;
        }
        
        //memocheck
    	if(dp[i][j] != -1){
            return dp[i][j];
        }
    
    	//induction hypothesis and induction step
    	int ans = 0;
    	if (str1.charAt(i) == str2.charAt(j)){
            dp[i][j] = 1 + SSShelper(str1, str2, i + 1, j + 1, dp);
        }
    	else{
    		dp[i][j] = 1 + Math.min( SSShelper(str1, str2, i + 1, j, dp), SSShelper(str1, str2, i, j + 1, dp));
        }
        
    	return dp[i][j];
        
    }
}
