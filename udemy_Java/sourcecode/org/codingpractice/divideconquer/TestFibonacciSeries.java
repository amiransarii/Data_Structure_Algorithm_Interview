package org.codingpractice.divideconquer;

public class TestFibonacciSeries {
	
	public static void main(String args[]) {
		
		
		int fib = getFibonacciNumber(9);
		System.out.println(fib);
	}
	
	private static int getFibonacciNumber(int n) {
		
	      //base case 
		 
		if (n < 1) {
			System.out.println("Please enter a positive number"); 
			return Integer.MIN_VALUE;
		}else if (n == 1) {
			return 0;
		}else if (n == 2) {
			return 1;     
		}else  {
			return getFibonacciNumber(n-1) + getFibonacciNumber(n-2);
		}
		
	}

}
