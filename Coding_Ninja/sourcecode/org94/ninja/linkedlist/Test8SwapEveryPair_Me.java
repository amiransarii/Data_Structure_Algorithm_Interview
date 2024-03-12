package org94.ninja.linkedlist;

import org.nininja.utils.LinkedListNode;

public class Test8SwapEveryPair_Me {
	public static LinkedListNode<Integer> swapEveryPair(LinkedListNode<Integer> head) {

		LinkedListNode<Integer>  temp = head;
 
        /* Traverse only till there are atleast 2 nodes left */
        while (temp != null && temp.next != null) {
 
            /* Swap the data */
            int k = temp.data;
            temp.data = temp.next.data;
            temp.next.data = k;
            temp = temp.next.next;
        }
      
	  return head;
	}
}
