package org5.ninja.hashmaps;

/**
 * Problem statement
Given two strings string1 and string2 (named large and small), find the smallest substring in 
string1 containing all characters of string2 in O(n). You need to return the output substring.

Note : The characters of string2 need not to be present in same order in string1. That is, 
we need a substring which contains all characters of string2 irrespective of the order.

Return null if no substring with all characters is present.

Detailed explanation ( Input/output format, Notes, Images )
Input format :
Line 1 : String 1
Line 2 : String 2
Output Format :
Smallest substring
Constraints :
1 <= Length of string1 & string2 <= 10^4

Sample Input 1 :
Looks for minimum string
mums
Sample Output 1 :
mum s
 * 
 *
 */
public class Test_94_Smallest_SubString {
	public static String findMinSubstringContainingString(String large, String small){
	       final int no_of_chars = 256;
	        int len1 = large.length();
	        int len2 =small.length();
	 
	        if (len1 < len2) {
	            return "";
	        }
	 
	        int hash_small[] = new int[no_of_chars];
	        int hash_large[] = new int[no_of_chars];
	 
	        // Store occurrence ofs 
	        // characters of pattern
	        for (int i = 0; i < len2; i++)
	            hash_small[small.charAt(i)]++;
	 
	        int start = 0, start_index = -1,
	            min_len = Integer.MAX_VALUE;
	 
	        // Start traversing the string
	        // Count of characters
	        int count = 0; 
	        for (int j = 0; j < len1; j++) {
	    
	            hash_large[large.charAt(j)]++;
	 
	            // If string's char matches 
	            // with pattern's char
	            // then increment count
	            if (hash_large[large.charAt(j)]
	                <= hash_small[large.charAt(j)])
	                count++;
	 
	            // If all the characters are matched
	            if (count == len2) { 
	                // Try to minimize the window
	                while (hash_large[large.charAt(start)]
	                           > hash_small[large.charAt(start)]
	                       || hash_small[large.charAt(start)]
	                              == 0) {
	 
	                    if (hash_large[large.charAt(start)]
	                        > hash_small[large.charAt(start)])
	                        hash_large[large.charAt(start)]--;
	                    start++;
	                }
	 
	                // update window size
	                int len_window = j - start + 1;
	                if (min_len > len_window) {
	                    min_len = len_window;
	                    start_index = start;
	                }
	            }
	        }
	 
	        // If no window found
	        if (start_index == -1) {
	            return "";
	        }
	 
	        // Return substring starting 
	        // from start_index
	        // and length min_len
	        return large.substring(start_index,
	                             start_index + min_len);
	    }
	//https://www.geeksforgeeks.org/find-the-smallest-window-in-a-string-containing-all-characters-of-another-string/
}
