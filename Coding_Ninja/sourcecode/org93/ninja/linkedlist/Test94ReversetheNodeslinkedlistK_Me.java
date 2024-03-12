package org93.ninja.linkedlist;

import org.nininja.utils.Node;

public class Test94ReversetheNodeslinkedlistK_Me {
	public static Node<Integer> kReverse(Node<Integer> head, int k) {
		if(head == null  ||  k<= 1){
            return head;
        }
        
       Node<Integer>prev = null;
        Node<Integer> dummy = head;
        int c = 0;

        while(dummy != null && c < k ) {
            Node next = dummy.next;
            dummy.next = prev;
            prev = dummy;
            dummy = next;
            c++;
        }
        if(dummy != null) {
            head.next = kReverse(dummy,k);
        }
        return prev;


	}

}
