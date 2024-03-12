package org93.ninja.linkedlist;

import org.nininja.utils.Node;

public class Test5PrintIthNode_Me {
	static int size(Node head){
		Node curr = head;
		int len = 0;

		while (curr != null){
			len ++;
			curr = curr.next;
		}
		return len;
	}

    public static void printIthNode(Node<Integer> head, int i){
		int length = size(head);

		if(i> length || head == null){
			return;
		}

      int  idx = 0;
	  Node current = head;
	  while (idx <= i -1){
		  current = current.next;
		  idx ++;
	  }
     System.out.println(current.data);
    }
}
