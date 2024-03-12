package org93.ninja.linkedlist;

import org.nininja.utils.Node;

public class Test93SwapTwoNodes_Me {
	public static Node<Integer> swapNodes(Node<Integer> head, int i, int j) {
		if (i == j)
            return head;

      Node<Integer> prev1  = null, node1 = null, prev2 = null, node2 = null;

        //Search for the first node
        int count1 = 0;
        int count2=0;
        node1 = head;
        while (node1 != null && count1 != i) {
            prev1 = node1;
            node1 = node1.next;
            count1++;
        }

        //Search for the second node
        node2 = head;
        while (node2 != null && count2 != j) {
            prev2 = node2;
            node2 = node2.next;
            count2++;
        }

        if (node1 == null || node2 == null)
            return head;

        Node<Integer>  tail1 = node1.next, tail2 = node2.next;

        if (node2 == node1.next) {
            if (prev1 != null)
                prev1.next = node2;
            node2.next = node1;
            node1.next = tail2;
        }
        else if(node1 == node2.next) {
            if (prev2 != null)
                prev2.next = node1;
            node1.next = node2;
            node2.next = tail1;
        }
        else {
            if (prev1 != null)
                prev1.next = node2;
            node2.next = tail1;
            if (prev2 != null)
                prev2.next = node1;
            node1.next = tail2;
        }

        if (node1 == head)
            head = node2;
        else if (node2 == head)
            head = node1;

        return head;
	}
}
