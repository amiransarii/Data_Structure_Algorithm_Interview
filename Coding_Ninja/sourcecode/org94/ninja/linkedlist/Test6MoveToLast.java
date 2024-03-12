package org94.ninja.linkedlist;

import org.nininja.utils.Node;

/**
 * Problem statement
Given a linked list and a key in it, the task is to move all occurrences of given key to end of linked list, keeping order of all other elements same.

Return the updated head of LL.

Detailed explanation ( Input/output format, Notes, Images )
Input Format :
Line 1 : Elements of the linked list ending with -1 (-1 not included)
Line 2 : Key n, Element which has to shifted
Output Format :
Updated linked list
Constraints :
1 <= size of list <= 100

Sample Input 1:
1 2 2 3 4 5 -1
2
Sample Output 1:
1 3 4 5 2 2 
Sample Input 2:
1 1 2 3 4 -1
1
Sample Output 2:
2 3 4 1 1
}

************/



public class Test6MoveToLast {
	public static Node<Integer> func(Node<Integer> head,int n) {
		Node<Integer> temp = head , prev = null , last = null;
		int len = 1;
		while(temp.next!=null){
		len++;
		temp = temp.next;
		}
		last = temp;
		temp = head;
		//int flag=0;
		for(int i=0;i<len;i++){
		//flag=0;
		if(temp.data == n){
		if(prev == null){
		Node<Integer> temp2 = new Node<Integer>(temp.data);
		head = head.next;
		last.next = temp2;
		prev = null;
		temp = head;
		}
		else{
		Node<Integer> temp2 = new Node<Integer>(temp.data);
		prev.next = temp.next;
		last.next = temp2;
		temp = temp.next;
		}
		last = last.next;
		}
		else{
		prev=temp;
		temp = temp.next;
		}
		}
		return head;
		}

}
