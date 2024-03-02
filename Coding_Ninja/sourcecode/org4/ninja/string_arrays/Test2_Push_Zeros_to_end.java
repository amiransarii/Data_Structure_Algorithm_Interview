package org4.ninja.string_arrays;

/**
 * 
 * Problem statement
You have been given a random integer array/list(ARR) of size N. You have been required to 
push all the zeros that are present in the array/list to the end of it. Also, make sure to maintain 
the relative order of the non-zero elements.

Note:
Change in the input array/list itself. You don't need to return or print the elements.

You need to do this in one scan of array only. Don't use extra space.


Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= t <= 10^2
0 <= N <= 10^5
Time Limit: 1 sec
Sample Input 1:
1
7
2 0 0 1 3 0 0
Sample Output 1:
2 1 3 0 0 0 0

 Explanation for the Sample Input 1 :
All the zeros have been pushed towards the end of the array/list. Another important fact 
is that the order of the non-zero elements have been maintained as they appear in the input array/list.
Sample Input 2:
2
5
0 3 0 2 0
5
9 0 0 8 2
Sample Output 2:
3 2 0 0 0
9 8 2 0 0 
 *
 */
public class Test2_Push_Zeros_to_end {
	public static void pushZerosAtEnd(int[] arr) {
		int nonZero = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[nonZero];
				arr[nonZero] = temp;
				nonZero++;
			}
		}
	}

}
