package org93.ninja.linkedlist;

import org.nininja.utils.Node;

public class Test7DeleteNodeFromLinkedList_Me {
	// get the length of linked list

	public static int getSize(Node<Integer> head){
		int len =  0;
		Node<Integer> curr = head;
		while (curr != null){
           len ++;
		   curr = curr.next;;
		}
		return len;
	}

	public static Node<Integer> deleteNode( Node<Integer> head, int pos) {
		int size = getSize(head);
		if ( pos > size){
			return head;
		}
		else if ( pos == 0){
			return head.next;
		}

		else{
			     int idx = 0;
				 Node<Integer> curr = head;

		 		 while (idx < pos -1){
					  curr = curr.next;
					  idx ++;
				 }

				 if(curr.next != null){
					 curr.next = curr.next.next;
				 }

				 return head;

		}

	}
}
