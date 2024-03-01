package org.codingpractice.divideconquer;

/**
 * 
 * @author amiransari
 *
 *Given N, count the number of ways to
 *express N as sum of 1, 3 and 4
 */
public class TestNumberFactor {
	
	public static void main(String args[]) {
		
		System.out.println(noOfWays(4));
		System.out.println(noOfWays(5));
		System.out.println(noOfWays(6));
	}
	
	
	
	private static int noOfWays(int n) {
	
		 if(n ==  0 || n == 1 || n == 2) {
			 return 1;
		 }
		
		  if( n == 3) {
			 return 2;
		 }
		 
		    int subtract1 = noOfWays(n - 1); // if we subtract 1, we will be left with 'n-1'
			int subtract3 = noOfWays(n - 3); // if we subtract 3, we will be left with 'n-3'
			int subtract4 = noOfWays(n - 4); // if we subtract 4, we will be left with 'n-4'

			return subtract1 + subtract3 + subtract4;
		
	}

}
