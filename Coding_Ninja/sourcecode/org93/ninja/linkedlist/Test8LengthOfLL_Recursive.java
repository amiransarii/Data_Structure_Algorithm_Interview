package org93.ninja.linkedlist;
import org.nininja.utils.LinkedListNode;
/*
 * Problem statement
Given a linked list, find and return the length of the given linked list recursively.

Detailed explanation ( Input/output format, Notes, Images )
 Constraints :
1 <= t <= 20
0 <= N <= 10^4
Time Limit: 1 sec
Sample Input 1:
1 
3 4 5 2 6 1 9 -1
Sample Output 1:
7
 */

/*
Time complexity: O(N)
Space complexity: O(N)
where N is the length of the singly linked list
*/

public class Test8LengthOfLL_Recursive {
	public static int length(LinkedListNode<Integer> head){
		if(head == null){
		return 0;
		}
		return 1 + length(head.next);
		}
}
