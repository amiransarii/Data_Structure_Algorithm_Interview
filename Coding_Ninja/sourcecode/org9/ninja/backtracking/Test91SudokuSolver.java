package org9.ninja.backtracking;

/**
 * Problem statement
You are given a 9*9 sudoku board, in which some entries are filled, and others are 0 (0 indicates that the cell is empty).



You must return true if the Sudoku puzzle can be solved. Else return false.

Detailed explanation ( Input/output format, Notes, Images )
Sample Input :

Explain
9 0 0 0 2 0 7 5 0 
6 0 0 0 5 0 0 4 0 
0 2 0 4 0 0 0 1 0 
2 0 8 0 0 0 0 0 0 
0 7 0 5 0 9 0 6 0 
0 0 0 0 0 0 4 0 1 
0 1 0 0 0 5 0 8 0 
0 9 0 0 7 0 0 0 4 
0 8 2 0 4 0 0 0 6
Sample Output :
true
 * 
 *
 */
public class Test91SudokuSolver {
	public static boolean sudokuSolver(int board[][]) {
		int row = -1;
		int col = -1;
		boolean flag = false;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (board[i][j] == 0) {
					row = i;
					col = j;
					flag = true;
					break;
				}
			}
			if (flag) {
				break;
			}
		}
		if (row == -1) {
			return true;
		}
		for (int num = 1; num <= 9; num++) {
			if (isPossible(board, row, col, num)) {
				board[row][col] = num;
				if (sudokuSolver(board)) {
					return true;
				}
				board[row][col] = 0;
			}
		}
		return false;
	}

	private static boolean isPossible(int[][] board, int row, int col, int num) {
		if (presentInRow(board, row, num)) {
			return false;
		}
		if (presentInCol(board, col, num)) {
			return false;
		}
		if (presentInBox(board, row - row % 3, col - col % 3, num)) {
			return false;
		}
		return true;
	}

	private static boolean presentInBox(int[][] board, int row, int col, int num) {
		for (int i = row; i < row + 3; i++) {
			for (int j = col; j < col + 3; j++) {
				if (board[i][j] == num) {
					return true;
				}
			}
		}
		return false;
	}

	private static boolean presentInCol(int[][] board, int col, int num) {
		for (int j = 0; j < 9; j++) {
			if (board[j][col] == num) {
				return true;
			}
		}
		return false;
	}

	private static boolean presentInRow(int[][] board, int row, int num) {
		for (int j = 0; j < 9; j++) {
			if (board[row][j] == num) {
				return true;
			}
		}
		return false;
	}
}
