package org.codingpractice.divideconquer;

public class TestMinCostToReachLastCell {
	
	private int findMinCost(int[][] cost, int row, int col) {
		
		if(row == -1 || col == -1) {  //BASE CASE
			return Integer.MAX_VALUE;
		}
		
		if(row == 0 && col == 0) {//BASE CASE: If we're at first cell (0, 0),then no need to recurse
			return cost[0][0];
		}
		
		int minCost1 = findMinCost(cost, row -1, col);
		int minCost2 = findMinCost(cost, row, col -1);
		int minCost =  Integer.min(minCost1, minCost2);
		int currentCellsCost = cost[row][col];
		return minCost + currentCellsCost;
		
	}
	public static void main(String[] args) {
		int[][] array =
			{
				{ 4, 7, 8, 6, 4 },
				{ 6, 7, 3, 9, 2 },
				{ 3, 8, 1, 2, 4 },
				{ 7, 1, 7, 3, 7 },
				{ 2, 9, 8, 9, 3 }
			};
		
		TestMinCostToReachLastCell mctrlc = new TestMinCostToReachLastCell();
		System.out.print("The minimum cost is " + mctrlc.findMinCost(array, array.length-1, array[0].length-1));
	}//end of method
}
