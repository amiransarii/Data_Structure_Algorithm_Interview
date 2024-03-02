package org4.ninja.string_arrays;

/**
 * Problem statement
Given an integer array A of size n. Find and print all the leaders present in the input array. 
An array element A[i] is called Leader, if all the elements following it (i.e. present at its right) 
are less than or equal to A[i].

Print all the leader elements separated by space and in the same order they are present in the input array.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= n <= 10^6

Sample Input 1 :
6
3 12 34 2 0 -1
Sample Output 1 :
34 2 0 -1


Sample Input 2 :
5
13 17 5 4 6
Sample Output 2 :
17 6
 * 
 *
 */
public class Test4_Leaders_Array {
	public static void leaders(int[] input) {
		int i;
		int j;
		for (i = 0; i < input.length - 1; i++) {
			for (j = i + 1; j < input.length; j++) {
				if (input[i] < input[j]) {
					break;
				}
			}
			if (j == input.length) {
				System.out.print(input[i] + " ");
			}
		}
		System.out.print(input[input.length - 1]);
	}
}
