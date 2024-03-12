package org93.ninja.linkedlist;

import org.nininja.utils.Node;

/*
 * Problem statement
Given the head of a singly linked list of integers, find and return its length.


Example:
Sample Linked List

The length of the list is 4. Hence we return 4.

Note:
Exercise caution when dealing with edge cases, 
such as when the head is NULL. Failing to handle 
these edge cases appropriately may result in a runtime error in your code.


Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1 :
3 4 5 2 6 1 9 -1


Sample Output 1 :
7


Explanation of sample input 1 :
The number of nodes in the given linked list is 7.
Hence we return 7.


Sample Input 2 :
10 76 39 -3 2 9 -23 9 -1

Sample Output 2 :
8


Expected Time Complexity:
Try to do this in O(n).


 Constraints :
0 <= N <= 10^5
Time Limit: 1 sec
 */

/*
Time Complexity : O(n)
Space Complexity : O(1)
where n is size of singly linked list
*/


public class Test4CountNodesofLinkedList {
	public static int length(Node head){
		// Initialize a variable 'len' to zero and a pointer 'temp' to the 'head' of the list.
		int len = 0;
		Node temp = head;
		// It then enters a loop that increments 'len' by one for each node in the list and
		// moves the 'temp' pointer to the next node.
		while (temp != null)
		{
		len++;
		temp = temp.next;
		}
		// Return the 'length' of the list.
		return len;
		}
}
