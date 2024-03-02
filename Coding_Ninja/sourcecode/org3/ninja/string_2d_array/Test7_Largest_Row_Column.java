package org3.ninja.string_2d_array;

/*
 * Problem statement
For a given two-dimensional integer array/list of size (N x M), you need to find out 
which row or column has the largest sum(sum of all the elements in a row or column) amongst all the rows/columns.

Note :
If there are more than one rows/columns with maximum sum, consider the row/column that comes first. 
And if ith row and jth column has the same largest sum, consider the ith row as answer.
Detailed explanation ( Input/output format, Notes, Images )
Constraints:
1 <= t <= 10^2
1 <= N <= 10^3
1 <= M <= 10^3
Time Limit: 1sec

Sample Input 1:
1
3 2
6 9 
8 5 
9 2 
Sample Output 1:
column 0 23


Sample Input 2:

Explain
1
4 4
6 9 8 5 
9 2 4 1 
8 3 9 3 
8 7 8 6 
Sample Output 2:
column 0 31
 */
public class Test7_Largest_Row_Column {
	public static void findLargest(int mat[][]) {
		boolean isRow = true;
		int largestSum = Integer.MIN_VALUE;
		int num = 0;
		int nRows = mat.length;
		if (nRows == 0) {
			System.out.println("row " + num + " " + largestSum);
			return;
		}
		int mCols = mat[0].length;
		for (int i = 0; i < nRows; i++) {
			int rowSum = 0;
			for (int j = 0; j < mCols; j++) {
				rowSum += mat[i][j];
			}
			if (rowSum > largestSum) {
				largestSum = rowSum;
				num = i;
			}
		}
		for (int j = 0; j < mCols; j++) {
			int colSum = 0;
			for (int i = 0; i < nRows; i++) {
				colSum += mat[i][j];
			}
			if (colSum > largestSum) {
				largestSum = colSum;
				num = j;
				isRow = false;
			}
		}
		if (isRow) {
			System.out.println("row " + num + " " + largestSum);
		} else {
			System.out.println("column " + num + " " + largestSum);
		}
	}
}