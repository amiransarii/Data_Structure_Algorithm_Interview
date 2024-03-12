package org94.ninja.linkedlist;

import org.nininja.utils.Node;

public class Test4ReverseLL_Recursive_Me {
	public static Node<Integer> reverseRec(Node<Integer> head) {
        if(head == null || head.next == null){
            return head;
        }
      Node<Integer> finalHead = reverseRec(head.next);
       Node<Integer> tmp = finalHead;

       while (tmp.next  != null){
           tmp = tmp.next;
       }

       tmp.next = head;
       head.next = null;

       return finalHead;

	}
}
