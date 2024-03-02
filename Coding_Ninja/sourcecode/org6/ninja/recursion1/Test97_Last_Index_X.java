package org6.ninja.recursion1;

/**
 * Problem statement
Given an array of length N and an integer x, you need to find all the indexes 
where x is present in the input array. Save all the indexes in the output array (in increasing order).

Do this recursively. Indexing in the array starts from 0.

Hint:
Try making a helper function with the required arguments and call the helper function 
from the allIndexes function.
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= N <= 10^3
Sample Input :
5
9 8 10 8 8
8
Sample Output :
1 3 4
 * 
 *
 */
public class Test97_Last_Index_X {
	public static int[] allIndexes(int input[], int x, int startIndex) {
		if (startIndex == input.length) {
			int output[] = new int[0];
			return output;
		}
		int smallOutput[] = allIndexes(input, x, startIndex + 1);
		if (input[startIndex] == x) {
			int output[] = new int[smallOutput.length + 1];
			output[0] = startIndex;
			for (int i = 0; i < smallOutput.length; i++) {
				output[i + 1] = smallOutput[i];
			}
			return output;
		} else {
			return smallOutput;
		}
	}

	public static int[] allIndexes(int input[], int x) {
		return allIndexes(input, x, 0);
	}
}
