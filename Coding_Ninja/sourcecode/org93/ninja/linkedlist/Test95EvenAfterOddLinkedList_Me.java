package org93.ninja.linkedlist;

import org.nininja.utils.Node;

public class Test95EvenAfterOddLinkedList_Me {
	public static Node<Integer> evenAfterOdd(Node<Integer> head) {

        if(head == null){
            return null;
        }
		Node<Integer>  oddHead = null;
        Node<Integer> oddTail = null;
        Node<Integer>  evenHead = null;
        Node<Integer> evenTail = null;

       Node<Integer> curr = head;

       while (curr != null){
           Node<Integer> newNode = new   Node<Integer>(curr.data);

           if(curr.data %2 != 0){ //handling odd scenario
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
           curr = curr.next;
       }

          if(oddHead == null){
               evenTail.next = null;
               return evenHead;
           }
           
           else if(evenHead == null){
               oddTail.next = null;
               return oddHead;
           }
           else{
                oddTail.next = null;
                evenTail.next = null;
                 oddTail.next = evenHead;
           }
           return oddHead;
	}
}
