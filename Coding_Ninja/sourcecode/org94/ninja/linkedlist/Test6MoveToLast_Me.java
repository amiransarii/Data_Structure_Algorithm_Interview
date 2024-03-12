package org94.ninja.linkedlist;

import org.nininja.utils.Node;

public class Test6MoveToLast_Me {
	public static Node<Integer> func(Node<Integer> head,int key) {
        // Keeps track of locations where key
       // is present.
      Node<Integer> pKey = head;

       // Traverse list
      Node<Integer> pCrawl = head;
       while (pCrawl != null) {
           // If current pointer is not same as pointer
           // to a key location, then we must have found
           // a key in linked list. We swap data of pCrawl
           // and pKey and move pKey to next position.
           if (pCrawl != pKey && pCrawl.data != key) {
               pKey.data = pCrawl.data;
               pCrawl.data = key;
               pKey = pKey.next;
           }

           // Find next position where key is present
           if (pKey.data != key)
               pKey = pKey.next;

           // Moving to next Node
           pCrawl = pCrawl.next;
       }
        
        return head ;
      		
	}
}
