package org7.ninja.recursion2;
/*
 * Problem statement
Given an integer n, print all n digit increasing numbers in increasing order in one line.

Numbers you need to print should be in increasing order and only those numbers should 
be printed which have digits in increasing order.

Detailed explanation ( Input/output format, Notes, Images )
Input Format :
Integer n
Output Format :
 Numbers in increasing order
Constraints :
1 <= n <= 8

Sample Input :
2
Sample Output :
12 13 14 15 16 17 18 19 23 24 25 26 27 28 29 34 35 36 37 38 39 45 46 47 48 49 56 57 58 59 67 68 69 78 79 89 
 */
public class Test94IncreasingNumbers {
	public static void printIncreasingNumber(int n) {
		printIncreasingNumber(1,n, "");
		
	}

	public static void printIncreasingNumber(int start, int n,String out){
       if(n == 0){
		   System.out.print(out +" ");
		   return ;
	   }
	  // start from (prev digit + 1) till 9
	   for(int i = start; i <= 9; i++){
		   // append current digit to number
		   String str = out + Integer.toString(i);
		   //recursive call
		   printIncreasingNumber(i+1,n-1,  str);
	   }
	}
	//https://www.geeksforgeeks.org/print-all-n-digit-strictly-increasing-numbers/
}
