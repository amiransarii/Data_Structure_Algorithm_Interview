package org93.ninja.linkedlist;

import org.nininja.utils.ListNode;

public class Test96DivideLinkedListInTwo_Me {
	public static ListNode<Integer> getReverseHead(ListNode<Integer> curr){
		ListNode<Integer> prev = null;
		ListNode<Integer> next = null;

		while (curr != null){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}

	public static void make2List(ListNode<Integer> head) {

		if(head == null){
            return ;
        }
		ListNode<Integer>  oddHead = null;
        ListNode<Integer> oddTail = null;
        ListNode<Integer>  evenHead = null;
        ListNode<Integer>evenTail = null;
		ListNode<Integer> revEvenHead = null;
		ListNode<Integer> revOddHead = null;

       ListNode<Integer> curr = head;
	   int pos = 0;

       while (curr != null){
           ListNode<Integer> newNode = new   ListNode<Integer>(curr.data);

           if(pos %2 != 0){ //handling odd scenario
               if(oddHead == null){
                   oddHead = newNode;
                   oddTail = newNode;
               }
               else{
                   oddTail.next = newNode;
                   oddTail = newNode;
               }
           }
           else{
                if(evenHead  == null){
                   evenHead  = newNode;
                   evenTail = newNode;
               }
               else{
                   evenTail.next = newNode;
                   evenTail = newNode;
               }
           }
		    pos++;
           curr = curr.next;
       }
       
	    if(oddHead != null){
			  oddTail.next = null;
			   revOddHead = getReverseHead(oddHead);
           }
           if(evenHead != null){
               evenTail.next = null;
			  revEvenHead = getReverseHead(evenHead);
           }
          
		 
		 while(revEvenHead != null){
			System.out.print( revEvenHead.data +" ");
			revEvenHead  =revEvenHead .next;
		}
        	System.out.println();
	    while(revOddHead  != null){
			System.out.print(  revOddHead .data +" ");
			revOddHead  = revOddHead .next;
		}
       
	}
}
