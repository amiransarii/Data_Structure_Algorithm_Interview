package org7.ninja.recursion2;

public class Test5PrintSubsequences {

	public static void printSubsequnces(String input, String output) {
		if(input.length() == 0) {
			System.out.println(output);
			return;
		}
		
		//we choose not to include the first character
		printSubsequnces(input.substring(1), output);
		//we choose to include the first character
		printSubsequnces(input.substring(1), output+input.charAt(0));
	}
	
public static  void printSubsequences(String input){
		
	printSubsequnces(input, "");
	}
	
	public static void main(String[] args) {
		printSubsequences("xy");
	}
}
