package org.codingpractice.divideconquer;

public class TestLongestPalindromicSubstring {
	
	private int findLPSLength(String str) {
		
		return lps_aux(str, 0, str.length() -1);
	}

	
	
	private int lps_aux(String str, int startIndex, int endIndex) {
		
	 if(startIndex > endIndex) {////BASE CASE - If we have traversed more than 1/2 of string then return 0 as we dont need to process it
		
			return 0;
		}
		
		if(startIndex == endIndex) { ////BASE CASE - If both the index are at same position then its a palidrome as its 1 character.
			return 1;
		}
		
		
		 int c1 = 0;
		 
		 if(str.charAt(startIndex) == str.charAt(endIndex)) { //CASE#1 - If index pointed characters matches then we 
			 
			 int remainingLength = endIndex - startIndex -1;//add 2 to the existing known palindrome length only if
			 
			 if(remainingLength == lps_aux(str, startIndex +1, endIndex -1)) {
				 
				 c1 = remainingLength + 2;
			 }			 
		 }
		 
		 int c2 = lps_aux(str, startIndex +1, endIndex);
		 int c3 = lps_aux(str, startIndex, endIndex -1);
		 
		 return Math.max(c1, Math.max(c2, c3));
	}
	
	public static void main(String[] args) {
		TestLongestPalindromicSubstring lps = new TestLongestPalindromicSubstring();
		System.out.println("Longest Palindromic Substring: " + lps.findLPSLength("ABCCBUA"));
	}// end of method

}
