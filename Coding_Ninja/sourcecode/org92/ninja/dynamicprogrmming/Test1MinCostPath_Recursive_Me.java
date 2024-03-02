package org92.ninja.dynamicprogrmming;

public class Test1MinCostPath_Recursive_Me {
public static int minCostPath(int[][] input) {
		
		return  minCostPath(input,0,0);
	}

	public static int minCostPath(int[][] input, int row, int col) {
	
	int len_rows = input.length;
	int len_cols = input[0].length;

	if(row == len_rows-1  && col == len_cols-1){
		return input[row][col];
	}

	if ( row >= len_rows || col >= len_cols){
		return Integer.MAX_VALUE;
	}

	
        int op1 = minCostPath(input, row, col+1);
		int op2 = minCostPath(input, row+1, col+1);
		int op3 = minCostPath(input, row+1, col);
		return  input[row][col] + Math.min(op1, Math.min(op2, op3));
	

		
		
	}
}
