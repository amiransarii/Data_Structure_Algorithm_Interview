package org5.ninja.hashmaps;
import java.util.*;
/*
 * Problem statement
 * Given two strings S1 and S2, find and return the minimum number
 * of deletions to be made (total count of deletions in both strings) in order to make the strings anagram.
 * Anagram of a string is a string which is its permutation.
 *  For example "bbaa" and "abab" are anagrams of each other but "bbaa" and "aaab" are not.
 *  
 * Sample Input 1 :
 * cde 
 * abc
Sample Output 1 :
4

Sample Input 2 :
aab
aba
Sample Output 2 :
0
 */
public class Test_9_Make_Strings_Anagram {
	public static int makeAnagram(String src, String tar) {
		int length = 0;
		HashMap<Character, Integer> m = new HashMap<Character, Integer>();
		
		for (int i = 0; i < src.length(); i++) {
			char c = src.charAt(i);
			if (m.containsKey(c))
				m.put(c, m.get(c) + 1);
			else
				m.put(c, 1);
		}
		
		
		for (int j = 0; j < tar.length(); j++) {
			char c = tar.charAt(j);
			if (m.containsKey(c) && m.get(c) != 0) {
				m.put(c, m.get(c) - 1);
				length += 2;
			}
		}
		int ans = src.length() + tar.length() - length;
		return ans;
	}

}
