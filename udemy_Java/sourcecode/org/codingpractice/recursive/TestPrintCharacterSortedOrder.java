package org.codingpractice.recursive;

import java.util.Arrays;

//print string character in sorted order
public class TestPrintCharacterSortedOrder {
	public static void main(String args[]) {
		
		String str = "bbccdefbbaa";
		sortCharacter(str);
		
		
	}
	
	
	
	
	
	
	
	
	
	private static void sortCharacter(String str) {
	 //convert String to char array
		char[] charArray = str.toCharArray();
		
		Arrays.sort(charArray); //sort char array
		
		for(int i = 0; i < charArray.length; i++) {
			System.out.print(charArray[i]);
		}
		
		
		
	}
	
	
	

}
