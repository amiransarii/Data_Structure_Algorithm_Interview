
package org7.ninja.recursion2;

/*
Time Complexity : O(n * log(n))
Space Complexity : O(n)
where n is size of input array
*/

/*
 * Problem statement
You are given the starting 'l' and the ending 'r' positions of the array 'ARR'.
You must sort the elements between 'l' and 'r'.
Note:
Change in the input array itself. So no need to return or print anything.
Example:

Explain
Input: ‘N’ = 7,
'ARR' = [2, 13, 4, 1, 3, 6, 28]

Output: [1 2 3 4 6 13 28]

Explanation: After applying 'merge sort' on the input array, the output is [1 2 3 4 6 13 28].
 */
public class Test3MergeSort {
	public static void mergeSort(int[] arr, int l, int r){
		//This means that there is atleast one element
		if(l < r) {
		// Finding the mid point
		int m = (l + r) / 2;
		// Sorting the first and second halves
		mergeSort(arr, l, m);
		mergeSort(arr, m + 1, r);
		// Merging the two sorted arrays
		merge(arr, l, m, r);
		}
		}
		public static void merge(int[] arr, int l, int m, int r)
		{
		// Stores the number of elements in the first half
		int num1 = m - l + 1;
		// Stores the number of elements in the second half
		int num2 = r - m;
		// Creating two temporary arrays of size
		// 'num1' and 'num2' respectively.
		int []L = new int[num1];
		int []R = new int[num2];
		// Copy data to temporary arrays
		for(int i = 0; i < num1; ++i) {
		L[i] = arr[l + i];
		}
		for(int j = 0; j < num2; ++j) {
		R[j] = arr[m + 1 + j];
		}
		// Merge the temporary arrays back into
		// arr[l ... r]
		int i = 0; // Initial index of the first subarray
		int j = 0; // Initial index of the second subarray
		int k = l; // Initial index of the merged subarray
		while (i < num1 && j < num2)
		{
		// If the current element in array 'L'
		// is less than current element in array 'R'
		// assign the current element of 'arr' to current
		// element of 'L' and increase index 'k' and 'i'.
		if (L[i] < R[j])
		{
		arr[k] = L[i];
		i++;
		}
		// assign the current element of 'arr' to current
		// element of 'R' and increase index 'k' and 'j'.
		else
		{
		arr[k] = R[j];
		j++;
		}
		k++;
		}
		// Copy the remaining elements of array 'L' to array
		
		while (i < num1)
		{
		arr[k] = L[i];
		i++;
		k++;
		}
		// Copy the remaining elements of array 'R' to array
		// 'arr'
		while (j < num2)
		{
		arr[k] = R[j];
		j++;
		k++;
		}
		}
}
