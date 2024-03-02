package org7.ninja.recursion2;

public class Test2RemoveConsecutiveDuplicates_Me {
	public static String removeConsecutiveDuplicates(String s) {
		if(s.length() <= 1){
			return s;
		}

		else if(s.charAt(0) == s.charAt(1)){
			return removeConsecutiveDuplicates(s.substring(1));
		}

		else{
			return s.charAt(0) + removeConsecutiveDuplicates(s.substring(1));
		}

	}
}
