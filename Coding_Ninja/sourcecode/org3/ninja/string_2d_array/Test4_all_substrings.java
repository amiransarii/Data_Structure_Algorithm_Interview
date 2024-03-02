package org3.ninja.string_2d_array;

/*
Time complexity: O(N^3)
Space complexity: O(1)
where N is the length of the input string
*/
/**
 * Problem statement
 
 For a given input string(str), write a function to print all the possible substrings.

Substring
A substring is a contiguous sequence of characters within a string. 
Example: "cod" is a substring of "coding". Whereas, "cdng" is not as the characters taken are not contiguous
Detailed explanation ( Input/output format, Notes, Images )
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 second
Sample Input 1:
abc
Sample Output 1:

Explain
a 
ab 
abc 
b 
bc 
c 
 Sample Input 2:
co
Sample Output 2:
c 
co 
o
 * 
 *
 */
public class Test4_all_substrings {
	public static void printSubstrings(String str) {
		int n = str.length();
		for (int i = 0; i < n; ++i) {
			for (int j = i; j < n; ++j) {
				for (int k = i; k <= j; ++k) {
					System.out.print(str.charAt(k));
				}
				System.out.println();
			}
		}
	}
}
