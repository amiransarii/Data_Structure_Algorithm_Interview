package org93.ninja.linkedlist;

import org.nininja.utils.ListNode;

/*
 * Problem statement
Given a two Linked Lists, find out union of both given input lists and return the new Linked List.

Order of elements are not important.

Note : You don't need to print the linked list, just return the head. It will be printed internally.
Input format :

Line 1 : Linked list 1 elements (separated by space and terminated by -1)

Line 2 : Linked list 2 elements (separated by space and terminated by -1)

Sample Input 1 :
1 2 3 4 -1
8 7 5 3 -1
Sample Output 1 :

Explain
1
2
3
4
8
7
5
Sample Input 2 :
1 2 1 1 -1
8 -1
Sample Output 2 :
1
2
1
1
8
 */
public class Test99UnionOfLL {
	public static ListNode<Integer> Union(ListNode<Integer> head1, ListNode<Integer> head2) {
		head1=sort(head1);
		head2=sort(head2);
		ListNode<Integer> head=new ListNode<Integer>(0),temp;
		temp=head;
		while(head1!=null&&head2!=null)
		{
		if(head1.data<head2.data)
		{
		temp.next=head1;
		head1=head1.next;
		}
		else if(head1.data>head2.data)
		{
		temp.next=head2;
		head2=head2.next;
		}
		else
		{ temp.next=head1;
		head1=head1.next;
		head2=head2.next;
		}
		temp=temp.next;
		}
		if(head1!=null)
		{
		temp.next=head1;
		}
		if(head2!=null)
		{
		temp.next=head2;
		}
		return head.next;
		}
		private static ListNode<Integer> merge2LinkedLists(ListNode<Integer> head1,
		ListNode<Integer> head2) {
		ListNode<Integer> temp,head=new ListNode<Integer>(0);
		temp=head;
		while(head1!=null&&head2!=null)
		{
		if(head1.data<head2.data)
		{
		head.next=head1;
		head1=head1.next;
		}
		else
		{
		head.next=head2;
		head2=head2.next;
		}
		head=head.next;
		}
		if(head1==null)
		{
		head.next=head2;
		}
		if(head2==null)
		{
		head.next=head1;
		}
		return temp.next;
		}
		public static ListNode<Integer> sort(ListNode<Integer> head) {
		if(head==null||head.next==null)
		return head;
		ListNode<Integer> slow =head,fast=head,mid=head,head1,head2;
		while(fast!=null&&fast.next!=null)
		{ mid=slow;
		slow=slow.next;
				fast=fast.next.next;
		}
		if(fast!=null)
		{
		mid=slow;
		}
		head1=head;
		head2=mid.next;
		mid.next=null;
		head1=sort(head1);
		head2=sort(head2);
		head=merge2LinkedLists(head1,head2);
		return head;
		}
}
