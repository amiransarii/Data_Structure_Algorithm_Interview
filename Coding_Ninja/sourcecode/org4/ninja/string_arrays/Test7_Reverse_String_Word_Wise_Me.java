package org4.ninja.string_arrays;

public class Test7_Reverse_String_Word_Wise_Me {
public static String reverseWordWise(String input) {
		
		String[] arr = input.split(" ");
		int n = arr.length;
		String rev = "";

		for(int i = n -1;  i >= 0; i--)
			rev += arr[i] +" ";
		
      
	  return rev;

	}
}
