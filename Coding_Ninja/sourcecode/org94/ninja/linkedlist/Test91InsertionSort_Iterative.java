package org94.ninja.linkedlist;

import org.nininja.utils.LinkedListNode;
import org.nininja.utils.Node;

/**
 * Problem statement
Sort a given linked list using Insertion Sort (iteratively).

You don't need to print the elements, just sort the elements and return the head of updated LL.
Input format : Linked list elements (separated by space and terminated by -1)`

Sample Input 1 :
1 4 5 2 -1
Sample Output 1 :
1 2 4 5
 * 
 *
 */


public class Test91InsertionSort_Iterative {
	class Solution {
		public LinkedListNode<Integer> insertionSort(LinkedListNode<Integer> node) {
		if (node == null) {
		return null;
		}
		LinkedListNode<Integer> sortedList = node;
		node = node.next;
		sortedList.next = null;
		while (node != null) {
		final LinkedListNode<Integer> current = node;
		node = node.next;
		if (current.data < sortedList.data) {
		current.next = sortedList;
		sortedList = current;
		} else {
		LinkedListNode<Integer> search = sortedList;
		while (search.next != null && current.data > search.next.data)
		{
		search = search.next;
		}
		current.next = search.next;
		search.next = current;
		}
		}
		return sortedList;
		}

	}
}
