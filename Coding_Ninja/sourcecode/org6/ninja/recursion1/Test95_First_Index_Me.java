package org6.ninja.recursion1;

public class Test95_First_Index_Me {
public static int firstIndex(int input[], int x) {
		
		return firstIndex(input,x,0);
	}

	public static int firstIndex(int input[], int x, int start_idx) {

		if( start_idx >= input.length)
		return -1;

		if(input[start_idx] == x){
			return start_idx;
		}

		return firstIndex(input,x, start_idx+1);


	}
}
