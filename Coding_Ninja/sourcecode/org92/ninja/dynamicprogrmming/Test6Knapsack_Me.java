package org92.ninja.dynamicprogrmming;

public class Test6Knapsack_Me {
	static int knapsack(int[] weight, int[] value, int n, int maxWeight) {
	    

	    int[] storagePrev = new int[maxWeight+1];
	    int[] storageCurr = new int[maxWeight+1];

	    for(int i = 1; i <= n; i++){
	        for(int j = 1; j <= maxWeight; j++){
	        
	        if(weight[i-1] > j){
	            storageCurr[j] = storagePrev[j];
	        }
	        else{
	            storageCurr[j] = Math.max( storagePrev[j] 
						, storagePrev[j-weight[i-1]] + value[i-1] );
	        }
	        }
	        storagePrev = storageCurr;
			storageCurr = new int[maxWeight+1];
	    }
	      return storagePrev[maxWeight];  

	    }
}
