package org93.ninja.linkedlist;

import org.nininja.utils.Node;

/*
Time Complexity : O(n)
Space Complexity : O(1)
Where 'n' is size of the Singly Linked List
*/

public class Test98DeletEveryNnodes_Me {
	public static Node<Integer> skipMdeleteN(Node<Integer> head, int M, int N) {
		if(head==null)
            return head;
        if(M==0)
            return null;
        if(N==0)
            return head;
       Node<Integer> curr=head,t;
        int count;
        while(curr!=null)
        {
        for(count=1;count<M && curr!=null;count++)
        {
            curr=curr.next;
        }
        if(curr==null)
            return head;
        t=curr.next;
        for(count=1;count<=N && t!=null;count++)
        {
            t=t.next;
        }
        curr.next=t;
        curr=t;}
        return head;
	}
}
