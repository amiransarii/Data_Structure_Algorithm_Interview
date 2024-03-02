package org6.ninja.recursion1;
/*
 * Problem statement
 * Given an array of length N and an integer x, you need to find and return the 
 * last index of integer x present in the array. Return -1 if it is not present in the array.
 * Last index means - if x is present multiple times in the array, return the index at which x comes last in the array.
 * You should start traversing your array from 0, not from (N - 1).
 * 
 * Do this recursively. Indexing in the array starts from 0.
 * Detailed explanation ( Input/output format, Notes, Images )
 * Constraints :
 * 1 <= N <= 10^3
 * 
 * Sample Input :
 * 4
 * 9 8 10 8
 * 8
 * Sample Output :
 * 3
 */
public class Test96_Last_Index {
	public static int lastIndex(int input[], int x, int startIndex) {
		if (startIndex == input.length) {
			return -1;
		}
		int smallAns = lastIndex(input, x, startIndex + 1);
		if (smallAns != -1) {
			return smallAns;
		}
		if (input[startIndex] == x) {
			return startIndex;
		} else {
			return -1;
		}
	}

	public static int lastIndex(int input[], int x) {
		return lastIndex(input, x, 0);
	}
}
