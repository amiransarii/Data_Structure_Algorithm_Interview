package org92.ninja.dynamicprogrmming;

public class Test5MaximumSquareWithAllZeros_Me {
	public static int findMaxSquareWithAllZeros(int[][] input){

		if(input.length == 0){
			return 0;
		}
        
	int[][] storage = new int[input.length][input[0].length];
        int max = Integer.MIN_VALUE;
        for(int i=0;i<input.length;i++) {
            storage[i][0] = input[i][0] ==0 ? 1: 0;
            max = Math.max(storage[i][0], max);
        }

        for(int i=0;i<input[0].length;i++) {
            storage[0][i] = input[0][i] ==0 ? 1: 0;
            max = Math.max(storage[0][i], max);
        }


        for(int i=1;i<input.length;i++) {
            for(int j=1;j<input[0].length;j++ ) {
                if(input[i][j]==1){
					storage[i][j] = 0;
                }
                else{
                    storage[i][j] = Math.min(Math.min(storage[i-1][j-1], storage[i-1][j] ),
                                             storage[i][j-1]
                                            ) + 1 ;
                }
                max = Math.max(storage[i][j], max);

            }
        }
        return max;


	
	}

}
