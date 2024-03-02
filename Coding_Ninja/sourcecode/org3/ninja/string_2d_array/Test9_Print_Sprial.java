package org3.ninja.string_2d_array;

/**
 * Problem statement
For a given two-dimensional integer array/list of size (N x M), print it in a spiral form. 
That is, you need to print in the order followed for every iteration:

a. First row(left to right)
b. Last column(top to bottom)
c. Last row(right to left)
d. First column(bottom to top)
 Mind that every element will be printed only once.
 * 
 *
 */
public class Test9_Print_Sprial {
	public static void spiralPrint(int mat[][]){
		int nRows = mat.length;
		if (nRows == 0) {
		return;
		}
		int mCols = mat[0].length;
		int i, rowStart = 0, colStart = 0;
		int numElements = nRows * mCols, count = 0;
		while(count < numElements){
		for(i = colStart; count < numElements && i < mCols; ++i) {
		System.out.print(mat[rowStart][i]+ " ");
		count++;
		}
		rowStart++;
		for(i = rowStart; count < numElements && i < nRows; ++i) {
		System.out.print(mat[i][mCols - 1] + " ");
		count++;
		}
		mCols--;
		for(i = mCols - 1; count < numElements && i >= colStart; --i) {
		System.out.print(mat[nRows - 1][i] + " ");
		count++;
		}
		nRows--;
		for(i = nRows - 1; count < numElements && i >= rowStart; --i) {
		System.out.print(mat[i][colStart] + " ");
		count++;
		}
		colStart++;
		}
		}

}
