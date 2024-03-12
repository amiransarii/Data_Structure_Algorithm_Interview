package org93.ninja.linkedlist;

import org.nininja.utils.ListNode;

/*
 * Problem statement
Write a function that takes one list and divides up its nodes to create two 
smaller lists A and B. The sub lists should be made from alternating elements in the original list.

Nodes should be in the reverse order of which they occurred in the source list.

Print both linked lists in different lines.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= n <= 10^4

Sample Input :
 8 2 5 9 1 4 3 7 -1
Note : -1 at the end of input is just a terminator representing the 
end of linked list. This -1 is not part of the linked list. Size of given linked list is 8.
Sample Output :
 3 1 5 8
 7 4 9 2
 */
public class Test96DivideLinkedListInTwo {
	public static void print(ListNode<Integer> head)
	{
	while(head!=null)
	{
	System.out.print(head.data+" ");
	head=head.next;
	}
	}
	public static void make2List(ListNode<Integer> head) {
	ListNode<Integer> t1=null,t2=null,temp;
	while(head!=null&&head.next!=null)
	{
	temp=head.next;
	head.next=t1;
	t1=head;
	head=temp;
	temp=temp.next;
	head.next=t2;
	t2=head;
	head=temp;
	}
	if(head!=null)
	{
	head.next=t1;
	t1=head;
	}
	print(t1);
	System.out.println();
	print(t2);
	return;
	}

}
