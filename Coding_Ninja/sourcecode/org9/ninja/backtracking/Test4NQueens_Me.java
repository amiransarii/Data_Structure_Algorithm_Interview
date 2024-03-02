package org9.ninja.backtracking;

public class Test4NQueens_Me {
public static void placeNQueens(int n){
		
		int[][] board = new int[n][n];
	    solveNQueens(board, 0,n); 

		}

	private static void solveNQueens(int[][] board, int row, int n) {
		
		/* base case: If all queens are places then return true */
		if(row == n) {
			printSolution(board,n);
			return;
		}
		/* Consider this column and try placing  this queen in all rows one by one */
		
		for(int i = 0;  i< n; i++) {
			/* Check if queen can be placed on 
	        board[row][i] */
			
			if(isSafe(board, row, i, n)) {
				/* Place this queen in board[row][i] */
				board[row][i] = 1;
				// Make result true if any placement is possible
				solveNQueens(board, row+1, n);
			
			
			/* If placing queen in board[row][i] 
            doesn't lead to a solution, then backtrack and
            remove queen from board[row][i] */
			board[row][i] = 0; 
			}
		}
		
	}
	
	static boolean isSafe(int board[][], int row, int col, int N) {
		int i, j;
		
		//Check if all values in the given column and rows from 0 to row-1 are 0
		for(i = 0; i < row; i++) {
			if(board[i][col] == 1)
				return false;
		}
		
		// Check upper diagonal on left side
		for(i = row, j = col; i>= 0 && j >= 0; i--,j-- )
			if(board[i][j] == 1)
				return false;
		
		//Check upper right diagonal
		for(i = row, j = col; i >= 0 && j< N; i--,j++) {
			if(board[i][j] == 1)
				return false;
		}
		return true;
	}

	  static void printSolution(int board[][], int N) 
		{ 
	    for (int i = 0; i < N; i++) 
	    { 
	        for (int j = 0; j < N; j++) 
	            System.out.print(board[i][j]+" ");  
	    } 
	    System.out.println(); 
		} 
}
