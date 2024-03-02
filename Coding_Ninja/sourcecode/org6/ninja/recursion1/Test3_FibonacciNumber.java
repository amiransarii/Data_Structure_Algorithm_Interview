package org6.ninja.recursion1;

public class Test3_FibonacciNumber {
	
	public static int fib(int n) {
		System.out.println("fib "+n);
		
		if(n == 0 || n == 1) {
			return n;
		}
		
		return fib(n-1) + fib(n-2);
	}
	
	public static void main(String [] args) {
		int n = 5;
		System.out.println(fib(n));
	}

}
