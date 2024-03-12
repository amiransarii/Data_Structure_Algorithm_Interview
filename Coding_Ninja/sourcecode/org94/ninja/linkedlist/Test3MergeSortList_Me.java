package org94.ninja.linkedlist;

import org.nininja.utils.Node;

public class Test3MergeSortList_Me {
	public static Node<Integer> getMiddle(Node<Integer>  head)
    {
        if (head == null)
            return head;
 
        Node<Integer>  slow = head, fast = head;
 
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node<Integer> sortedMerge(Node<Integer> a, Node<Integer> b)
    {
        Node<Integer> result = null;
        /* Base cases */
        if (a == null)
            return b;
        if (b == null)
            return a;
 
        /* Pick either a or b, and recur */
        if (a.data <= b.data) {
            result = a;
            result.next = sortedMerge(a.next, b);
        }
        else {
            result = b;
            result.next = sortedMerge(a, b.next);
        }
        return result;
    }



	public static Node<Integer> mergeSort(Node<Integer> h) {
		// Base case : if head is null
        if (h == null || h.next == null) {
            return h;
        }
 
        // get the middle of the list
        Node<Integer> middle = getMiddle(h);
        Node<Integer> nextofmiddle = middle.next;
 
        // set the next of middle node to null
        middle.next = null;
 
        // Apply mergeSort on left list
        Node<Integer> left = mergeSort(h);
 
        // Apply mergeSort on right list
        Node<Integer> right = mergeSort(nextofmiddle);
 
        // Merge the left and right lists
        Node<Integer> sortedlist = sortedMerge(left, right);
        return sortedlist;


	}
}
