package org.codingpractice.greedy;

import java.util.Arrays;

import org.codingpractice.methods.CoinChangeProblem;

public class TestCoinChangeProblem {
	
	public static void main(String args[]) {
		int [] coins = {1, 2, 5, 10, 50, 100, 500,2000};
		int amount = 2758;
		System.out.println("Coins available: "+Arrays.toString(coins));
		System.out.println("Target amount: "+ amount);
		CoinChangeProblem.coinChangeProblem(coins, amount);
		
	}

}
