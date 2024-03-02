package org6.ninja.recursion1;

public class Test92_Stack_overflow {
	public static int func(int num){
	    return func(num- 1);
	}

	public static void main(String[] args) {
	    int num = 5;
	    int ans = func(num - 1);
	    System.out.println(ans);
	}
}
