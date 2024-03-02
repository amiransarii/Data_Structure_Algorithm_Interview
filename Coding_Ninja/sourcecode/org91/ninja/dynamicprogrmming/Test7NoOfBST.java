package org91.ninja.dynamicprogrmming;
/*Problem statement
Given an integer h, find the possible number of balanced binary trees of height h. You just need to return the count of possible binary trees which are balanced.

This number can be huge, so, return output modulus 10^9 + 7.

Write a simple recursive solution.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= h <= 24
Time Limit: 1 sec
Sample Input 1:
3
Sample Output 1:
15
Sample Input 2:
4
Sample Output 2:
315
/*
    Time complexity: O(2^N)
    Space complexity: O(N)

    where N is the final height of the binary tree
*/


public class Test7NoOfBST {
	public static long balancedBTs(long n){
		if (n <= 1) {
		return 1;
		}
		int mod =(int) Math.pow(10, 9) + 7;
		long x = balancedBTs(n - 1);
		long y = balancedBTs(n - 2);
		long temp1 = (x * x) % mod; // Number of BTs made by attaching subtrees of height (n -1) at both sides of root
		long temp2 = (2 * x * y) % mod; // Number of BTs made by attaching subtrees of heights(n - 1) and (n - 2) at each side of root
		long ans = (temp1 + temp2) % mod;
		return ans;
		}
}
