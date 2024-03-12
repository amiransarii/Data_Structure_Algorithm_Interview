package org93.ninja.linkedlist;

import org.nininja.utils.LinkedListNode;


public class Test8LengthOfLL_Recursive_Me {
	public static int length(LinkedListNode<Integer> head){

        int len = 0;
        LinkedListNode<Integer> curr = head;

        while (curr != null){
            len++;
            curr = curr.next;
        }
        return len;

        
	}
}
