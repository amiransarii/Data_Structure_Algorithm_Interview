package org92.ninja.dynamicprogrmming;

/*
 * Given two strings s and t of lengths m and n respectively, find the edit distance between the strings.

Edit Distance

Explain
Edit Distance of two strings is minimum number of operations required to make one string equal to other. 
In order to do so you can perform any of the following three operations only :
1. Delete a character
2. Replace a character with another one
3. Insert a character
Note
Strings don't contain spaces
You need to find the edit distance from input string1 to input string2.
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1<= m,n <= 10
Time Limit: 1 second
Sample Input 1 :
abc
dc
Sample Output 1 :
2
 */
/*
Time complexity: O(3 ^ min(N, M))
Space complexity: O(min(N, M))
where N and M are the lengths of the two strings
*/

public class Test3EditDistance {
	public static int editDistance(String s1, String s2){
		if(s1.length() == 0){
		return s2.length();
		}
		if(s2.length() == 0){
		return s1.length();
		}
		if(s1.charAt(0) == s2.charAt(0)){
		return editDistance(s1.substring(1), s2.substring(1));
		}
		int op1 = 1 + editDistance(s1.substring(1), s2); // remove
		int op2 = 1 + editDistance(s1.substring(1), s2.substring(1)); // substitute
		int op3 = 1 + editDistance(s1, s2.substring(1)); // insert
		return Math.min(op1, Math.min(op2, op3));
		}
}
