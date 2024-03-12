package org93.ninja.linkedlist;

import org.nininja.utils.Node;

/*
 * Problem statement
For a given singly linked list of integers, arrange the nodes such that all the 
even number nodes are placed after the all odd number nodes. The relative order of the odd and even terms should remain unchanged.

Note :
1. No need to print the linked list, it has already been taken care. Only return the new head to the list.
2. Don't create a new linked list.
3.  Just change the data, instead rearrange the provided list.
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= t <= 10^2
0 <= M <= 10^5
Where M is the size of the singly linked list.

Time Limit: 1sec
Sample Input 1 :
1
1 4 5 2 -1
Sample Output 1 :
1 5 4 2 
Sample Input 2 :
2
1 11 3 6 8 0 9 -1
10 20 30 40 -1
Sample Output 2 :
1 11 3 9 6 8 0
10 20 30 40
 */

/*
Time Complexity : O(n)
Space Complexity : O(1)
Where 'n' is the size of the Singly Linked List
*/


public class Test95EvenAfterOddLinkedList {
	public static Node<Integer> evenAfterOdd(Node<Integer> head) {
		if (head == null) {
		return head;
		}
		Node<Integer> evenHead = null, oddHead = null, evenTail = null, oddTail = null;
		while (head != null) {
		if (head.data % 2 == 0) {
		if (evenHead == null) {
		evenHead = head;
		evenTail = head;
		} else {
		evenTail.next = head;
		evenTail = evenTail.next;
		}
		} else {
		if (oddHead == null) {
		oddHead = head;
		oddTail = head;
		} else {
		oddTail.next = head;
		oddTail = oddTail.next;
		}
		}
		head = head.next;
		}
		if (oddHead == null) {
		return evenHead;
		} else {
		oddTail.next = evenHead;
		}
		if (evenHead != null) {
		evenTail.next = null;
		}
		return oddHead;
		}

}
