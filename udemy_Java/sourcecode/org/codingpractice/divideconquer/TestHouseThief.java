package org.codingpractice.divideconquer;

public class TestHouseThief {
	
	public static void main(String[] args) {
		TestHouseThief ht = new TestHouseThief();
		int[] HouseNetWorth = {6, 7, 1, 30, 8, 2, 4};
		System.out.println(ht.maxMoney(HouseNetWorth));
		HouseNetWorth = new int[] {20, 5, 1, 13, 6, 11, 40};
		System.out.println(ht.maxMoney(HouseNetWorth));
	}
	
	
	public int maxMoney(int[] HouseNetWorth) {
		return maxMoneyRecursive(HouseNetWorth, 0);
	}//end of method

	private int maxMoneyRecursive(int[] HouseNetWorth, int currentIndex) {
		if (currentIndex >= HouseNetWorth.length) 
			return 0;

		int stealCurrentHouse = HouseNetWorth[currentIndex] + maxMoneyRecursive(HouseNetWorth, currentIndex + 2);
		int skipCurrentHouse = maxMoneyRecursive(HouseNetWorth, currentIndex + 1);

		return Math.max(stealCurrentHouse, skipCurrentHouse);
	}//end of method
}
