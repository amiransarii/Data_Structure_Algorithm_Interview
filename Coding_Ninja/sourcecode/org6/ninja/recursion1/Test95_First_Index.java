package org6.ninja.recursion1;
/**
 * Problem statement
Given an array of length N and an integer x, you need to find and return
 the first index of integer x present in the array. Return -1 if it is not present in the array.

First index means, the index of first occurrence of x in the input array.

Do this recursively. Indexing in the array starts from 0.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= N <= 10^3

Sample Input :
4
9 8 10 8
8
Sample Output :
1
 * 
 *
 */
public class Test95_First_Index {
	public static int firstIndex(int input[], int x, int startIndex) {
		if (startIndex == input.length) {
			return -1;
		}
		if (input[startIndex] == x) {
			return startIndex;
		}
		return firstIndex(input, x, startIndex + 1);
	}

	public static int firstIndex(int input[], int x) {
		return firstIndex(input, x, 0);
	}

}
