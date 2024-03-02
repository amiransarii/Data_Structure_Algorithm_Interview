package org6.ninja.recursion1;

/*
 * Problem statement
 * Write a recursive function that returns the sum of the digits of a given integer.
 * 
 * Detailed explanation ( Input/output format, Notes, Images )
Constraints :
0 <= N <= 10^9
Sample Input 1 :
12345
Sample Output 1 :
15


Sample Input 2 :
9
Sample Output 2 :
9
 */
public class Test99_Sum_Of_Digits {
	public static int sumOfDigits(int input){
		int sum;
		if(input < 10){
		return input;
		}
		sum = (input % 10) + sumOfDigits(input / 10);
		return sum;
		}
		
}
