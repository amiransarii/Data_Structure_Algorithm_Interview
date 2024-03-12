package org93.ninja.linkedlist;

import org.nininja.utils.Node;

public class Test2LinkedListUse {
	
	
public static void main(String[] args) {
		
		Node<Integer> node1 = new Node<Integer>(10);
		System.out.println(node1.data);
		System.out.println(node1.next);
		Node<Integer> node2 = new Node<Integer>(20);
		node1.next = node2;
		System.out.println(node2);
		System.out.println(node1.next);
		
		
		//print linked list
		Node<Integer> node11 = new Node<Integer>(10);
		Node<Integer> node22 = new Node<Integer>(20);
		Node<Integer> node33 = new Node<Integer>(30);
		node1.next = node22;
		node2.next = node33;
		Node<Integer> head = node1;
		print(head);
		print(head);

	}

public static void print(Node<Integer> head){
	
	while(head != null){
		System.out.print(head.data +" ");
		head = head.next;
	}
	System.out.println();

}

}
