package org93.ninja.linkedlist;

import org.nininja.utils.Node;



public class Test91DeleteNode_Recursively_Me {
	public static Node<Integer> deleteNodeRec(Node<Integer> head, int pos) {
		if (head == null) {
		return head;
		}
		if (pos == 0) {
		return head.next;
		}
		Node<Integer> smallHead = deleteNodeRec(head.next, pos - 1);
		head.next = smallHead;
		return head;
		}

}
