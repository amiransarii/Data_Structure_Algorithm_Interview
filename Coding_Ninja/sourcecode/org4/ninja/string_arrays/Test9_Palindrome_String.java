package org4.ninja.string_arrays;

/**
 * 
 * Problem statement
Given a string S, count and return the number of substrings of S that are palindrome.

Single length substrings are also palindromes. You just need to calculate the count, not the substrings.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= Length of S <= 1000

Sample Input :
aba
Sample Output :
4
**Note : Here 4 corresponds to ("a","b","a","aba").

 *
 */
public class Test9_Palindrome_String {
	public static int countPalindromeSubstrings(String input) {
        int count = 0;
		if (input.length() == 1)
		return 1;

		else if (input.length() == 0)
		return 0;

		else{
      
		  for(int i = 0 ; i < input.length() ; ++i) {
       count+= findPalindromesInSubString(input, i-1, i+1);
       count+= findPalindromesInSubString(input, i, i+1);
		}
		 
		
  }
    return count+input.length();
	}

	public static int findPalindromesInSubString(String input, int j, int k) {
  int count = 0;
  for (; j >= 0 && k < input.length(); --j, ++k) {
    if (input.charAt(j) != input.charAt(k)) {      
      break;
    } 
    count++;
  }
  return count;
}
}
