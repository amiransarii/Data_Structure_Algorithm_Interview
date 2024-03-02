package org6.ninja.recursion1;

public class Test8_Number_of_Digits_Me {
	public static int countDigits(int n){
	    
        if( n < 10)
        return 1;

     return 1 + countDigits(n/10);
}
}
