package org.codingpractice.divideconquer;

public class TestZeroOneKnapsack {
	
	public static void main(String[] args) {
		TestZeroOneKnapsack ks = new TestZeroOneKnapsack();
		int[] profits = { 31, 26, 72, 17 };
		int[] weights = { 3, 1, 5, 2 };
		int maxProfit = ks.knapsack(profits, weights, 7);
		System.out.println(maxProfit);
	}//end of method
	
	
	public int knapsack(int[] profits, int[] weights, int capacity) {
		return this.knapsackAux(profits, weights, capacity, 0);
	}//end of method

	
	private int knapsackAux(int[] profits, int[] weights, int capacity, int currentIndex) {
		
		//base case
		if(capacity <= 0 || currentIndex < 0 || currentIndex >= profits.length)
			return 0;
		
		int profit1 = 0;
		
		if(weights[currentIndex] <= capacity) 
			profit1 = profits[currentIndex] + knapsackAux(profits, weights, capacity - weights[currentIndex], currentIndex +1);
		
		int profit2 = knapsackAux(profits, weights, capacity, currentIndex +1); // Not taking current element
		
		return Math.max(profit1, profit2);
			
	}

}
