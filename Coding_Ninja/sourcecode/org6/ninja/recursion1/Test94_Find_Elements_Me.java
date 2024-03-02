package org6.ninja.recursion1;

public class Test94_Find_Elements_Me {
public static boolean checkNumber(int input[], int x) {
		
		return checkNumber( input ,x,0);
	}

	public static boolean checkNumber(int input[], int ele, int start_idx){

		if (start_idx >= input.length)
			return false;

		if ( input[start_idx] == ele)
			return true;

		return checkNumber(input, ele,start_idx+1);

	}
}
