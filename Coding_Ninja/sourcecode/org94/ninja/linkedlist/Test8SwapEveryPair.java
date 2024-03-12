package org94.ninja.linkedlist;

import org.nininja.utils.LinkedListNode;

/**
 * Problem statement
Given a Linked list, swap every pair of nodes to form a new linked list. That is, swap first two nodes, then 2nd two nodes and so on. If the size of linked list is odd, then leave the last node as it is.

You should not create new memory, instead change the references of already created nodes. And swap the entire node, not just their data.

Return the head of updated linked list.

-1 is the terminating number. That is, it just defines that your linked list has no more elements and it is not the part of LL.

Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1 :
1 2 3 4 5 6 -1
Sample Output 1 :
2 1 4 3 6 5
Sample Input 2 :
1 2 3 -1
Sample Output 2 :
2 1 3
}
 *
 * */


public class Test8SwapEveryPair {
	public static LinkedListNode<Integer> swapEveryPair(LinkedListNode<Integer> head) {
		if (head == null || head.next == null) {
		return head;
		}
		LinkedListNode<Integer> first = head, second = head.next;
		LinkedListNode<Integer> newHead = null, tail = null;
		while (first != null && second != null) {
		first.next = second.next;
		second.next = first;
		if (newHead == null) {
		newHead = second;
		tail = first;
		} else {
		tail.next = second;
		tail = first;
		}
		first = first.next;
		if (first == null) {
		break;
		}
		second = first.next;
		}
		return newHead;
		}
}
