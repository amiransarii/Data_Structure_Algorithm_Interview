package org6.ninja.recursion1;

public class Test6_Find_Power_Me {

	public static int power(int x, int n) {

		if ( n == 0)
		return 1;

		return x*power(x, n-1);
		
	}
}
