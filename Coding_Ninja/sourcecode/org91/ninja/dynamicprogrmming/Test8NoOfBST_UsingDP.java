package org91.ninja.dynamicprogrmming;
/*
 * Problem statement
Given an integer h, find the possible number of balanced binary trees of height h. 
You just need to return the count of possible binary trees which are balanced.

This number can be huge, so, return output modulus 10^9 + 7.

Time complexity should be O(h).

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= h <= 10^6
Time Limit: 1 sec
Sample Input 1:
3
Sample Output 1:
15
Sample Input 2:
4
Sample Output 2:
315

 */

/*
Time complexity: O(N)
Space complexity: O(N)
where N is the final height of the binary tree
*/

public class Test8NoOfBST_UsingDP {
	
	public static int balancedBTs(int height){
	if(height == 0){
	return 1;
	}
	int arr[] = new int[height + 1];
	arr[0] = arr[1] = 1;
	int mod = (int) Math.pow(10, 9) + 7;
	for(int i = 2; i <= height; i++){
	// Cast to long
	long temp1 = (long) (arr[i- 1]) * arr[ i - 1];
	temp1 = temp1 % mod;
	// Cast to long
	long temp2 = 2 * (long) (arr[i - 1]) * arr[ i - 2];
	temp2 = temp2 % mod;
	arr[i] = (int) (temp1 + temp2) % mod;
	}
	return arr[height];
	}
}
