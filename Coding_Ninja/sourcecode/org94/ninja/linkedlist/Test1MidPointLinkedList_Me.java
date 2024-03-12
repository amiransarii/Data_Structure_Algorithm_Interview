package org94.ninja.linkedlist;

import org.nininja.utils.LinkedListNode;
import org.nininja.utils.Node;

public class Test1MidPointLinkedList_Me {
	public static int getSize(Node<Integer> head){
        int len = 0;
        Node<Integer> curr = head;

        while (curr != null){
            len++;
            curr = curr.next;
        }
        return len;
    }
    public static Node<Integer> midPoint(Node<Integer> head) {
        
        if (head == null){
            return null;
        }

     Node<Integer>   fast = head;
     Node<Integer> slow = head;
     Node<Integer> prev = head;

     while (fast != null && fast.next != null){
         fast = fast.next.next;
         prev = slow;
         slow = slow.next;
     }
     if( getSize(head)%2 == 0){
         return prev;
     }
     else{
         return slow;
     }        
    }

}
