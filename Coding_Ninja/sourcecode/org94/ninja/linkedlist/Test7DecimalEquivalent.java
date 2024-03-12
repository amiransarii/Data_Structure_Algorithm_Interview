package org94.ninja.linkedlist;

import org.nininja.utils.Node;

/**
 * Problem statement
Given a singly linked list of 0s and 1s, find and return its decimal equivalent.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= size of list <= 100

Sample Input 1:
1 0 -1
Sample Output 1:
2
Sample Input 2:
1 0 1 -1
Sample Output 2:
5
 * @author amira
 *
 */

public class Test7DecimalEquivalent {
	public static int decimal(Node<Integer> head) {
		int ans = 0;
		while(head != null){
		ans = (ans << 1) + head.data;
		head = head.next;
		}
		return ans;
		}
}
