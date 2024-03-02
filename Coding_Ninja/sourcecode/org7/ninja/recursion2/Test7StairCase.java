package org7.ninja.recursion2;

/*
 * Problem statement
A child is running up a staircase with N steps, and can hop 
either 1 step, 2 steps or 3 steps at a time. Implement a method to count how many 
possible ways the child can run up to the stairs. You need to return number of possible ways W.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= N <= 30
Sample Input 1 :
4
Sample Output 1 :
7

Sample Input 2 :
5
Sample Output 2 :
13
			 
 */
public class Test7StairCase {
	public static int staircase(int n){

		 if (n == 0)
		 return 1;

		 else if ( n <0){
			 return 0;
		 }

		 else{
			 return staircase(n-1) + staircase(n-2) + staircase(n-3);
		 }
	}
}
