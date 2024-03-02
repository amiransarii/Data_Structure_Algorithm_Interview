package org7.ninja.recursion2;

public class Test92Interleavings_Me {
	public static void interleavings(String first, String second){

		interleavings(first,second,"");
		
	}

	public static void interleavings(String first, String second, String output) {
		if(first.length() == 0 && second.length() == 0) {
			System.out.println(output);
			return;
		}
		
		if(first.length() >= 1){
        interleavings( first.substring(1), second, output+first.charAt(0));
		}
		 
		if(second.length() >= 1){
         interleavings(first,second.substring(1), output+ second.charAt(0));
		}
		
}
}