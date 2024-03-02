package org4.ninja.string_arrays;

public class Test5_Print_Wave_Me {
public static void wavePrint(int mat[][]){
		
		int rows = mat.length;

		if (rows == 0){
			System.out.print(" ");
		}
		else{
			int cols = mat[0].length;

			for(int col = 0;  col < cols; col ++){

				for(int row = 0; row < rows; row++){

					if (col % 2 == 0){
						System.out.print(mat[row][col] +" ");
					}
					else{
						System.out.print(mat[rows-row-1][col] +" ");
					}

				}
			}
		}
	}
}
