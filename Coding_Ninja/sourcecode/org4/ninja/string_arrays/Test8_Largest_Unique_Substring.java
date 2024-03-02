package org4.ninja.string_arrays;

/**
 *Problem statement
Given a string S, find the largest substring with no repetition i.e. 
largest substring which contain all unique characters.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= Length os String S <= 10^3

Sample Input:
abcdabceb
Sample Output:
dabce 
 *
 *
 */
public class Test8_Largest_Unique_Substring {
	public static String findLargestUniqueSubstring(String str){
		if(str.length()==0){
		return "";
		}
		int lastIndex[] = new int[256];
		for(int i = 0; i < lastIndex.length; i++){
		lastIndex[i] = -1;
		}
		int currentSubstringStart = 0;
		int maxSubstringStart = 0;
		int maxSubstringEnd = 0;
		int maxSubstringLength = 1;
		for(int i = 0; i < str.length(); i++){
		char currentChar = str.charAt(i);
		if(lastIndex[currentChar] >= currentSubstringStart){
		if( i - currentSubstringStart > maxSubstringLength){
		maxSubstringStart = currentSubstringStart;
		maxSubstringEnd = i-1;
		maxSubstringLength = i - currentSubstringStart;
		}
		currentSubstringStart = lastIndex[currentChar] + 1;
		}
		lastIndex[currentChar] = i;
		}
		if( str.length() - currentSubstringStart > maxSubstringLength){
		maxSubstringStart = currentSubstringStart;
		maxSubstringEnd = str.length()-1;
		maxSubstringLength = str.length() - currentSubstringStart;
		}
		return str.substring(maxSubstringStart,maxSubstringEnd+1);
		}
}
