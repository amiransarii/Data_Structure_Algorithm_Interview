package org93.ninja.linkedlist;

import org.nininja.utils.Node;

public class Test92CheckPalindromeList_Me {
	public static Node<Integer> getMid(Node<Integer> curr){
		Node<Integer> fast =curr;
		Node<Integer> slow = curr; 
		Node<Integer> prev_slow = null;
		while(fast.next != null && fast.next.next != null){
			fast = fast.next.next;
			prev_slow =slow;
			slow = slow.next;
		}
		return slow;
	}

	//reverse the List
	public static Node<Integer> getReverseHead(Node<Integer> curr){
		Node<Integer> prev = null;
		Node<Integer> next = null;

		while (curr != null){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}

	public static boolean isPalindrome(Node<Integer> head) {
		if((head == null) || (head != null && head.next == null)  ){
			return true;
		}
      Node<Integer> mid = getMid(head);
	  
	  Node<Integer> revHead  = getReverseHead(mid);
	  while (head != null && revHead != null){
		  
		  if(revHead.data != head.data){
			  return false;
		  }
		  head = head.next;
		  revHead = revHead.next;
	  }
	  return true;

	}

}
