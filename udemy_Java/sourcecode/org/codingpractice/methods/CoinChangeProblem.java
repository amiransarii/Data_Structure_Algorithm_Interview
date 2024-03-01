package org.codingpractice.methods;

import java.util.Arrays;

public class CoinChangeProblem {
	
	
	public static void coinChangeProblem(int[] coins , int N) {
	
		//sort arrays
		Arrays.sort(coins);
		
		System.out.println("Sort Arrays");
		System.out.println(Arrays.toString(coins));
		
		int index =  coins.length -1; //last index
		
		while(true) {
			int coinValue = coins[index];
			index --;
			int maxAmount = (N/coinValue)*coinValue;
			
			if(maxAmount > 0) {
				System.out.println("Coin value: "+coinValue+ " taken count: "+(N/coinValue));
				N = N - maxAmount;
			}
			
			if(N == 0)
				break;
		}
		
		
	}

}
