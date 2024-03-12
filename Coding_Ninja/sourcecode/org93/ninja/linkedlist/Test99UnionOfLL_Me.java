package org93.ninja.linkedlist;

import org.nininja.utils.ListNode;

public class Test99UnionOfLL_Me {
	 public static ListNode<Integer>  sortList(ListNode<Integer> head)
	    {
	 
	        // Node current will point to head
	        ListNode<Integer> current = head, index = null;
	 
	        int temp;
	 
	        if (head == null) {
	            return null;
	        }
	        else {
	            while (current != null) {
	                // Node index will point to node next to
	                // current
	                index = current.next;
	 
	                while (index != null) {
	                    // If current node's data is greater
	                    // than index's node data, swap the data
	                    // between them
	                    if (current.data > index.data) {
	                        temp = current.data;
	                        current.data = index.data;
	                        index.data = temp;
	                    }
	 
	                    index = index.next;
	                }
	                current = current.next;
	            }
				 return head;
	        }
	       
			}
		public static ListNode<Integer> Union(ListNode<Integer> head1, ListNode<Integer> head2) {
			
			if (head1 == null && head2 == null){
				return null;
			}
			else if(head1 == null ){
	          return head2;
			}
			else if(head2 == null){
				return head1;
			}

			else{
				ListNode<Integer> t1=sortList(head1),t2=sortList(head2),tail=null,head=null;
				
				if(t1.data<=t2.data)
	        {
	            head=t1;
	            tail=t1;
	            t1=t1.next;
	            t2=t2.next;
	        }
	        else
	        {
	            head=t2;
	            tail=t2;
	            t2=t2.next;
	        }
			
				while(t1!=null &&t2!=null)
	        {
	            if(t1.data<t2.data)
	            {
	                tail.next=t1;
	                tail=t1;
	                t1=t1.next;
	            }
	            else if( t2.data < t1.data)
	            {
	                tail.next=t2;
	                tail=tail.next;
	                t2=t2.next;
	            }
	            else{
	                 tail.next=t1;
	                 tail=t1;
	                t1=t1.next;
	                t2=t2.next;
	            }
	        }
	        if(t1==null)
	            tail.next=t2;
	        if(t2==null)
	            tail.next=t1;
	        return head;
			}
			
		}
}
