package org92.ninja.dynamicprogrmming;

import java.util.Scanner;

public class Test91MaxSumRectangle_Me {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String row_col = sc.nextLine();
		String [] rowCol = row_col.split(" ");
		int n = Integer.parseInt(rowCol[0]); // no of rows
		int m = Integer.parseInt(rowCol[1]); // no of column

		int[][]matrix = new int[n][m];

		for ( int i = 0; i <n; i++){
			for(int j = 0; j <m; j++){
				matrix[i][j] = sc.nextInt();
			}
		}
		maxMatrixSum(matrix);
	}

	public static void maxMatrixSum(int[][] mat)
    {
        int m = mat.length;
        int n = mat[0].length;
        int preSum[][] = new int[m + 1][n];
 
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                preSum[i + 1][j] = preSum[i][j] + mat[i][j];
            }
        }
 
        int maxSum = -1;
        int minSum = Integer.MIN_VALUE;
        int negRow = 0, negCol = 0;
        int rStart = 0, rEnd = 0, cStart = 0, cEnd = 0;
        for (int rowStart = 0; rowStart < m; rowStart++) {
            for (int row = rowStart; row < m; row++) {
                int sum = 0;
                int curColStart = 0;
                for (int col = 0; col < n; col++) {
                    sum += preSum[row + 1][col]
                           - preSum[rowStart][col];
                    if (sum < 0) {
                        if (minSum < sum) {
                            minSum = sum;
                            negRow = row;
                            negCol = col;
                        }
                        sum = 0;
                        curColStart = col + 1;
                    }
                    else if (maxSum < sum) {
                        maxSum = sum;
                        rStart = rowStart;
                        rEnd = row;
                        cStart = curColStart;
                        cEnd = col;
                    }
                }
            }
        }
       System.out.print(maxSum);
    }
}
