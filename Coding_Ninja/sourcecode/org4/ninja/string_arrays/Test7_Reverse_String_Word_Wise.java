package org4.ninja.string_arrays;

/*
 * Problem statement
Reverse the given string word wise. That is, the last word in given string should 
come at 1st place, last second word at 2nd place and so on. Individual words should remain as it is.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
0 <= |S| <= 10^7
where |S| represents the length of string, S.
Sample Input 1:
Welcome to Coding Ninjas
Sample Output 1:
Ninjas Coding to Welcome


Sample Input 2:
Always indent your code
Sample Output 2:
code your indent Always
 */
public class Test7_Reverse_String_Word_Wise {
	public static String reverseWordWise(String input) {
		int end = input.length();
		int i = input.length() - 1;
		String output = "";
		while (i >= 0) {
		if (input.charAt(i) == ' ') {
		output = output + input.substring(i + 1, end) + " ";
		end = i;
		}
		i--;
		}
		output += input.substring(i + 1, end);
		return output;
		}
}
