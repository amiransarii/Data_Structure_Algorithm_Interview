package org6.ninja.recursion1;
/**
 * Problem statement
Given an array of length N and an integer x, you need to find if x is present in the array or not. Return true or false.

Do this recursively.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= N <= 10^3
Sample Input 1 :
3
9 8 10
8
Sample Output 1 :
true
Sample Input 2 :
3
9 8 10
2
Sample Output 2 :
false
 * 
 *
 */
public class Test94_Find_Elements {
	public static boolean checkNumber(int input[], int x, int startIndex) {
		if (startIndex == input.length) {
			return false;
		}
		if (input[startIndex] == x) {
			return true;
		}
		return checkNumber(input, x, startIndex + 1);
	}

	public static boolean checkNumber(int input[], int x) {
		return checkNumber(input, x, 0);
	}

}
