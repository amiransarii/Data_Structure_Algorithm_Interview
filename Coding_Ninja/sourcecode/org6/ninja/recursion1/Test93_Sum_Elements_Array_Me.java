package org6.ninja.recursion1;

public class Test93_Sum_Elements_Array_Me {
public static int sum(int input[]) {
		
		int n = input.length;

		if( n == 1)
		return input[0];

		else{
           return sum(input,0,n);
		}
		
		
	}

	public static int sum(int input[], int start_idx, int n){
		
		if ( start_idx >= n){
			return 0;
		}
		 return input[start_idx] + sum(input,start_idx+1, n);

	}
}
