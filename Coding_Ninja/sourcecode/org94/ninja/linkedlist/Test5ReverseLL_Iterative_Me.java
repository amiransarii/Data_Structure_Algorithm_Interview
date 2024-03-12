package org94.ninja.linkedlist;

import org.nininja.utils.Node;

public class Test5ReverseLL_Iterative_Me {
	public static Node<Integer> reverse_I(Node<Integer> head){

        if(head == null){
            return null;
        }
      Node<Integer> curr = head;
      Node<Integer> prev = null;
      Node<Integer> tmp;

          while(curr != null){
              tmp = curr.next;
              curr.next = prev;
              prev = curr;
              curr = tmp;
          }

          return prev;



        
      
        
	}
}
