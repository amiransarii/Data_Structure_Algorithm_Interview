package org6.ninja.recursion1;

/*
Time Complexity: O(1)
Space Complexity: O(1)
Where 'n' is the given number.
*/

/**
 * Problem statement
You are given a number 'n'.

Return number of digits in ‘n’.

Example:

Explain
Input: 'n' = 123

Output: 3

Explanation:
The 3 digits in ‘123’ are 1, 2 and 3. 
 * 
 *
 */
public class Test8_Number_of_Digits {
	public static int countDigits(int n) {
		return (int) (Math.log10(n) + 1);
		}
}
