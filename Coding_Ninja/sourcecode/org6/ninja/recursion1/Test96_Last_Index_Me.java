package org6.ninja.recursion1;

public class Test96_Last_Index_Me {

	public static int lastIndex(int input[], int x) {
		return lastIndex(input,x,0,-1);
	}

	public static int lastIndex(int input[], int x, int start_idx, int idx){

		if(start_idx == input.length)
		return idx;

		else if (input[start_idx] == x){
			idx = start_idx;
		}
		return lastIndex( input, x, start_idx+1, idx);


	}
}
