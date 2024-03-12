package org93.ninja.linkedlist;

import org.nininja.utils.ListNode;

/*
 * Problem statement
Write a function that moves last element to front in a given singly Linked List.

For example, if the given Linked List is 1->2->3->4->5, then the function should change the list to 5->1->2->3->4.

You just need to return the head of new linked list, don't print the elements.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= n <= 10^4

Sample Input :
 1 2 3 4 5 6 -1
Note : -1 at the end of input is just a terminator representing the end of 
linked list. This -1 is not part of the linked list. Size of given linked list is 6.
Sample Output :
 6 1 2 3 4 5
 */
public class Test97LetLastBeTheFirst_Me {
	static int getSize(ListNode<Integer> head){
		   int len = 0;
		   ListNode<Integer> curr = head;

		   while (curr != null){
			   len ++;
			   curr = curr.next;
		   }

		   return len;
	   }
		
		public static ListNode<Integer> lastToFront(ListNode<Integer> head) {
			if(head == null){
				return null;
			}
			int size = getSize(head);

			if(size == 1){
				return head;
			}

			ListNode<Integer> curr = head;

			for(int i = 0; i < size-2; i++){
				curr = curr.next; // reach the second last node
			}
			curr.next.next = head;
			head = curr.next;
			curr.next = null;
			return head;


		}
}
