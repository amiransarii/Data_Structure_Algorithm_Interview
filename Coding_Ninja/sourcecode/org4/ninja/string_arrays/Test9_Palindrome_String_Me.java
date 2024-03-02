package org4.ninja.string_arrays;

public class Test9_Palindrome_String_Me {
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
