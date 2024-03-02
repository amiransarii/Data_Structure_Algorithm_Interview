package org9.ninja.backtracking;

public class Test91SudokuSolver_Me {
public static boolean sudokuSolver(int board[][]){
		
		return sudokuhelper(board, 0, 0);
		
	}

	public static boolean sudokuhelper(int[][] board, int row, int col) {
		if (col == board[0].length) {
			row++;
			col = 0;
		}
		if (row == board.length) {
			return true;
		}
		if (board[row][col] != 0) {
			return sudokuhelper(board, row, col + 1);
		}
		for (int i = 1; i <= 9; i++) {
			if (isitsafe(board, row, col, i)) {
				board[row][col] = i;
				if (sudokuhelper(board, row, col + 1)) {
					return true;
				} else {
					board[row][col] = 0;
				}
			}
		}
		return false;
	}

	public static boolean isitsafe(int[][] board, int row, int col, int num) {
		for (int i = 0; i < board.length; i++) {
			if (board[i][col] == num) {
				return false;
			}
		}
		for (int j = 0; j < board[0].length; j++) {
			if (board[row][j] == num) {
				return false;
			}
		}
		int sqrt = (int) Math.sqrt(board.length);
		int rs = row - (row % sqrt);
		int cs = col - (col % sqrt);
		for (int r = rs; r < rs + sqrt; r++) {
			for (int c = cs; c < cs + sqrt; c++) {
				if (board[r][c] == num) {
					return false;
				}
			}
		}
		return true;
	}

}
