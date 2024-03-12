package org93.ninja.linkedlist;

import org.nininja.utils.Node;

public class Test90InsertNode_Recursively_Me {
	public static Node<Integer> insertNode(Node<Integer> head, int pos, Node<Integer> newNode) {

        Node<Integer> curr = head;

        if(pos == 0){
            newNode.next = head;
            head = newNode;
        }
        else{
          int idx = 0;
        while (idx < pos -1){
            curr = curr.next;
            idx++;
        }
        newNode.next = curr.next;
        curr.next = newNode;
        }
       
        return head;
        
    }
}
