package org6.ninja.recursion1;

/**
 * Problem statement
Given an array of length N, you need to find and return the sum of all elements of the array.

Do this recursively.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= N <= 10^3
Sample Input 1 :
3
9 8 9
Sample Output 1 :
26
Sample Input 2 :
3
4 2 1
Sample Output 2 :
7    
 * 
 *
 */
public class Test93_Sum_Elements_Array {
	public static int sum(int input[], int startIndex) {
		if (startIndex == input.length) {
			return 0;
		}
		return input[startIndex] + sum(input, startIndex + 1);
	}

	public static int sum(int input[]) {
		return sum(input, 0);
	}

}
