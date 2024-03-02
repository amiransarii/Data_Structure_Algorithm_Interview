package org6.ninja.recursion1;

public class Test991_Multiplication_Me {
public static int multiplyTwoIntegers(int m, int n){
		
		if( m == 0 || n == 0){
			return 0;
		}
		else if ( m == 1){
			return n;
		}
		else if (n == 1){
			return m;
		}
		else{
			return m + multiplyTwoIntegers(m,n-1);
		}
		
	}
}
