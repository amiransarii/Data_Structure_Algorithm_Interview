package org93.ninja.linkedlist;

import org.nininja.utils.Node;

public class Test4CountNodesofLinkedList_Me {
	public static int length(Node head){
        int len = 0;
        Node current = head;

        while ( current != null){
            len += 1;
            current = current.next;
        }
        return len;
    }
}
