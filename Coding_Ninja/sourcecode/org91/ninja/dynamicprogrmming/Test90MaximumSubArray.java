package org91.ninja.dynamicprogrmming;
/*
 * Given an integer array containing both negative and positive integers. Find and return the sum of contiguous sub-array with maximum sum.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 = N = 1000

-100 = A[i] <= 100

Sample Input 1:
3
1 2 3
Sample Output 1:
6
Sample Input 2:
4
-1 -2 -3 -4
Sample Output 2:
-1

 */
public class Test90MaximumSubArray {
	public static int findSum(int arr[],int n){
		int tempArr[] = new int[n];
		tempArr[0] = arr[0];
		int result = tempArr[0];
		for(int i =1;i<n;i++){
		if((arr[i]+tempArr[i-1])>arr[i])
		tempArr[i] = arr[i]+tempArr[i-1];
		else
		tempArr[i] = arr[i];
		if(tempArr[i]>result)
		result = tempArr[i];
		}
		return result;
		}
}
