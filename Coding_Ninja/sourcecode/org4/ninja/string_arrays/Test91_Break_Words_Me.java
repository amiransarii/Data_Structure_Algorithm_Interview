package org4.ninja.string_arrays;

public class Test91_Break_Words_Me {
	public static String breakWords(String input){
		String[] input_arr = input.split(" ");
		String retStr ="";

		for (String inp: input_arr){
			int size = inp.length();
			
			if (size%2 == 0 && size>=4)
				retStr += inp.substring(0, size/2) +" "+inp.substring(size/2) +" ";
			
			else
			 retStr += inp +" ";
			
		}

		return retStr;
		
	}
	
}
