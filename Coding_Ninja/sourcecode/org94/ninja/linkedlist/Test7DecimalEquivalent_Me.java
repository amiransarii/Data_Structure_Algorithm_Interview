package org94.ninja.linkedlist;

import org.nininja.utils.Node;

public class Test7DecimalEquivalent_Me {
	public static int decimal(Node<Integer> head) {
	       // Initialized result 
	    int res = 0; 
	 
	    // Traverse linked list 
	    while (head != null) 
	    { 
	        // Multiply result by 2 and add 
	        // head's data 
	        res = (res << 1) + (head.data); 
	 
	        // Move next 
	        head = head.next; 
	    } 
	    return res; 
	    }
}
