package org4.ninja.string_arrays;

public class Test6_Print_Sprial_Me {
	public static void spiralPrint(int matrix[][]){
		int rows = matrix.length;

        if (rows == 0)
            System.out.print("");

        else {
            int cols = matrix[0].length;
            int elements = rows * cols;
            int rowLowLim = 0;
            int rowUpLim = rows - 1;
            int colLowLim = 0;
            int colUpLim = cols - 1;

            while (elements > 0) {
                // Left -> Right
                for (int i = colLowLim; i <= colUpLim && elements > 0; i++) {
                    System.out.print(matrix[rowLowLim][i] + " ");
                    elements--;
                }

                // Top->Bottom
                rowLowLim++;
                for (int i = rowLowLim; i <= rowUpLim && elements > 0; i++) {
                    System.out.print(matrix[i][colUpLim] + " ");
                    elements--;
                }

                // Right->Left
                colUpLim--;
                for (int i = colUpLim; i >= colLowLim && elements > 0; i--) {
                    System.out.print(matrix[rowUpLim][i] + " ");
                    elements--;
                }

                // Bottom ->Top
                rowUpLim--;
                for (int i = rowUpLim; i >= rowLowLim && elements > 0; i--) {
                    System.out.print(matrix[i][colLowLim] + " ");
                    elements--;
                }

                colLowLim++;
            }
        }
	}
}
