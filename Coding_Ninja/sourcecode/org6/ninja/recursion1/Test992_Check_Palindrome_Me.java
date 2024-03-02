package org6.ninja.recursion1;

public class Test992_Check_Palindrome_Me {
	 public static boolean isPalindrome(String str) {
	        
         if (str.length() == 0 || str.length() == 1) 
         return true;
         
         if (str.charAt(0) == str.charAt(str.length() - 1))
         return isPalindrome(str.substring(1, str.length() - 1));

  return false;
    }
}
