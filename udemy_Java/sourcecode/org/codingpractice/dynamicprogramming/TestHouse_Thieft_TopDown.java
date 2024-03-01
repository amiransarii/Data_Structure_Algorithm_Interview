package org.codingpractice.dynamicprogramming;

import org.codingpractice.divideconquer.TestHouseThief;

/**
 * 
 * @author amir.ansari
 * calculate the maximum Profit
 */
public class TestHouse_Thieft_TopDown {
	

	public static int maxMoney(int[] HouseNetWorth,int n) {
		 int [] dp = new int[n +1];
		 
		 return getMaximumProfit(HouseNetWorth, 0, dp);
		
		//return maxMoneyRecursive(HouseNetWorth, 0);
	}//end of method

	
	
	 private static int getMaximumProfit(int[] HouseNetWorth, int currentIndex, int[]dp) {
		 
		 if(currentIndex >= HouseNetWorth.length) {
			 return 0;
		 }
		 
		 // now use dynamic programming 
		 
		  if(dp[currentIndex] == 0) { //if not evalauted before
			  
		    int stealCurrentHouse = HouseNetWorth[currentIndex] + getMaximumProfit(HouseNetWorth,currentIndex +2,dp);
			int skipCurrentHouse = getMaximumProfit(HouseNetWorth, currentIndex +1,dp);			
			dp[currentIndex] = Math.max(stealCurrentHouse, skipCurrentHouse);
		  }
		 
		
		 
		 return dp[currentIndex];
		 
	 }

	 public static void main(String[] args) {
			TestHouseThief ht = new TestHouseThief();
			int[] HouseNetWorth = {6, 7, 1, 30, 8, 2, 4};
			System.out.println(ht.maxMoney(HouseNetWorth));
			HouseNetWorth = new int[] {20, 5, 1, 13, 6, 11, 40};
			System.out.println(ht.maxMoney(HouseNetWorth));
		}
		
}
