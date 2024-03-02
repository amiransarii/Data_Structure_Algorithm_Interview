package org7.ninja.recursion2;
import java.util.*;
/*
 * Problem statement
Given a string S and an integer k, you need to find and return 
all the possible strings that can be made of size k using only characters present in string S.

The characters can repeat as many times as needed.

Note : The number of output strings can be at max 1000.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= Length of String S <= 10

1 <= k <= 5

Sample Input 1 :
abc 2
Sample Output 1 :

Explain
aa
ab
ac
ba
bb
bc
ca
cb
cc
 */
public class Test95StringLengthK {
	public static String[] allStrings(String charSet, int len){
		
		// Write your code here 
	        HashMap<Character,Boolean> map=new HashMap<>();
	        for (int i=0; i<charSet.length();i++){
	            if(!map.containsKey(charSet.charAt(i))){
	                map.put(charSet.charAt(i),true);
	            }
	        }
	        ArrayList<Character> al=new ArrayList<Character>();
	        for (Map.Entry<Character,Boolean> entry:map.entrySet()){
	            al.add(entry.getKey());
	        }
	        ArrayList<String> real=new ArrayList<String>();
	        String pre="";
	        perm(pre,al,len,real);
	        String []a=new String[real.size()];
	        a=real.toArray(a);
	        return a;

		}

		public static void perm(String pre,ArrayList<Character> al,int k,ArrayList<String> real) {
	       if(k==0){
	        real.add(pre);
	        return;
	    }
	    for(int i=0;i<al.size();i++){
	        perm(pre+al.get(i),al,k-1,real);
	    }
	    }
	 	
}

//https://stackoverflow.com/questions/58707459/print-all-the-strings-possible-of-length-k-from-a-given-string-with-repition-all