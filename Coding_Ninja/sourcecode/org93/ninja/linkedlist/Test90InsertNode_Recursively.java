package org93.ninja.linkedlist;

import org.nininja.utils.Node;

/*
 * Problem statement
You are given a singly linked list of integers and position 'i'.

You must insert the given node at the 'i-th' position in the linked list recursively.



 Note :
Assume that the Indexing for the linked list always starts from 0.

No need to print the list. It has already been taken care of. Only return the new head to the list.
Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1 :
3 4 5 2 6 1 9 -1
3
4
Sample Output 1 :
3 4 5 4 2 6 1 9
Sample Input 2 :
30 -1
0
2
Sample Output 2 :
2 30
10 20 30 50 60 6
Constraints :
0 <= M <= 10^5
Where M is the size of the singly linked list.
0 <= i < M

Time Limit:  1se
 */
public class Test90InsertNode_Recursively {
	public static Node<Integer> insertNode(Node<Integer> head, int pos, Node<Integer> newNode) {
		if (head == null) {
		return newNode;
		}
		if (pos == 0) {
		newNode.next = head;
		return newNode;
		}
		Node<Integer> smallHead = insertNode(head.next, pos - 1, newNode);
		head.next = smallHead;
		return head;
		}
}
