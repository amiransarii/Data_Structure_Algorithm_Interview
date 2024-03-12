package org93.ninja.linkedlist;

import org.nininja.utils.ListNode;

public class Test97LetLastBeTheFirst {
	public static ListNode<Integer> lastToFront(ListNode<Integer> head) {
		if(head==null||head.next==null)
		return head;
		ListNode<Integer> temp=head,ptr=head;
		while(temp.next!=null)
		{ ptr=temp;
		temp=temp.next;
		}
		ptr.next=null;
		temp.next=head;
		head=temp;
		return head;
		}
}
