package org3.ninja.string_2d_array;

/*
Time complexity: O(N)
Space complexity: O(1)
where N is the length of the input string
*/


/**
 * 
 * Problem statement
 * For a given input string(str), find and return the total number of words present in it.

It is assumed that two words will have only a single space in between. Also, 
there wouldn't be any leading and trailing spaces in the given input string.

Detailed explanation ( Input/output format, Notes, Images )
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 sec
Sample Input 1:
Coding Ninjas!
Sample Output 1:
2


Sample Input 2:
this is a sample string
Sample Output 2:
5
 *
 */
public class Test2_Counts_Words {
	public static int countWords(String str) {
		if (str.length() == 0) {
			return 0;
		}
		int spaces = 0;
		for (int i = 0; i < str.length(); ++i) {
			if (str.charAt(i) == ' ') {
				++spaces;
			}
		}
		return spaces + 1;
	}
}