package org92.ninja.dynamicprogrmming;
/*
 * Problem statement
An integer matrix of size (M x N) has been given. Find out the minimum cost to reach from the cell (0, 0) to (M - 1, N - 1).

From a cell (i, j), you can move in three directions:

1. ((i + 1),  j) which is, "down"
2. (i, (j + 1)) which is, "to the right"
3. ((i+1), (j+1)) which is, "to the diagonal"
The cost of a path is defined as the sum of each cell's values through which the route passes.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= M <= 10 ^ 2
1 <= N <=  10 ^ 2

Time Limit: 1 sec
Sample Input 1 :
3 4
3 4 1 2
2 1 8 9
4 7 8 1
Sample Output 1 :
13
Sample Input 2 :
3 4
10 6 9 0
-23 8 9 90
-200 0 89 200
Sample Output 2 :
76
Sample Input 3 :

Explain
5 6
9 6 0 12 90 1
2 7 8 5 78 6
1 6 0 5 10 -4 
9 6 2 -10 7 4
10 -2 0 5 5 7
Sample Output 3 :
18
 */

/*
Time Complexity : O(3 ^ P) where P = (M*N)
Space Complexity : O(max(M, N))
Where M and N are the rows rows and columns of the matrix.
*/
public class Test1MinCostPath_Recursive {
	private static int minCostPathHelper(int[][] input, int mRows, int nCols, int currRow,
			int currCol) {
			if (currRow >= mRows || currCol >= nCols) {
			return Integer.MAX_VALUE;
			}
			if (currRow == (mRows - 1) && currCol == (nCols - 1)) {
			return input[currRow][currCol];
			}
			int downCost = minCostPathHelper(input, mRows, nCols, (currRow + 1), currCol);
			int diagonalCost = minCostPathHelper(input, mRows, nCols, (currRow + 1), (currCol +
			1));
			int leftCost = minCostPathHelper(input, mRows, nCols, currRow, (currCol + 1));
			return input[currRow][currCol] + Math.min(diagonalCost, Math.min(downCost,
			leftCost));
			}
			public static int minCostPath(int[][] input) {
			int mRows = input.length;
			if (mRows == 0) {
			return Integer.MAX_VALUE;
			}
			int nCols = input[0].length;
			return minCostPathHelper(input, mRows, nCols, 0, 0);
			}

}
