package org94.ninja.linkedlist;

import org.nininja.utils.Node;

/**
 * 
 * Problem statement
Given a singly linked list of integers, reverse it iteratively and return the head to the modified list.

 Note :
No need to print the list, it has already been taken care. Only return the new head to the list.
Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1 :
1
1 2 3 4 5 6 7 8 -1
Sample Output 1 :
8 7 6 5 4 3 2 1
Sample Input 2 :
2
10 -1
10 20 30 40 50 -1
Sample Output 2 :
10 
50 40 30 20 10 
 *
 */

/*
Time complexity: O(N)
Space complexity: O(1)
where N is the length of the singly linked list
*/


public class Test5ReverseLL_Iterative {
	public static Node<Integer> reverse_I(Node<Integer> head) {
		Node<Integer> curr = head;
		Node<Integer> prev = null;
		Node<Integer> fwd = null;
		while (curr != null) {
		fwd = curr.next;
		curr.next = prev;
		prev = curr;
		curr = fwd;
		}
		return prev;
		}

	
}
