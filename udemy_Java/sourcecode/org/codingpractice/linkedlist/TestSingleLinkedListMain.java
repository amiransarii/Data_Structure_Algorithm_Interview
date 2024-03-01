package org.codingpractice.linkedlist;

import org.codingpractice.methods.SingleLinkedListOperation;

/**
 * 
 * @author amir.ansari
 *implement all the operation of Single Linked List
 */
public class TestSingleLinkedListMain {

public static void main(String[] args) {
		
		SingleLinkedListOperation list = new SingleLinkedListOperation();
		list.createSingleLinkedList(5);
		//list.deleteLinkedList();
		
		list.insertInLinkedList(10, 1);
		//list.deleteLinkedList();
		
		list.insertInLinkedList(20, 2);
		//list.deleteLinkedList();
		
		list.insertInLinkedList(30, 2);
		//list.deleteLinkedList();
		
		list.insertInLinkedList(40, 1);
		//list.deleteLinkedList();
	
		//list.deleteLinkedList();
		System.out.println();
			
		
		System.out.println("\nSearching the node having value 40...");
		list.searchNode(40);

		System.out.println("\nSearching the node having value 500...");
		list.searchNode(500);
		
		
		System.out.println("\n\nDeleting the node having location = 0: ");
		System.out.println("Before Deletion:");
		list.deleteLinkedList();
		list.deletionOfNode(0);
		System.out.println("After Deletion:");
		list.deleteLinkedList();
		System.out.println();
		
		System.out.println("\n\nDeleting the node having location = 2: ");
		System.out.println("Before Deletion:");
		list.deleteLinkedList();
		list.deletionOfNode(2);
		System.out.println("After Deletion:");
		list.deleteLinkedList();
		System.out.println();
		
	
		System.out.println("\n\nDeleting the node having location = 100: ");
		System.out.println("Before Deletion:");
		list.deleteLinkedList();
		list.deletionOfNode(100);
		System.out.println("After Deletion:");
		list.deleteLinkedList();
		System.out.println();
		
		
		list.deleteLinkedList();
		list.deleteLinkedList();
		
	
	}
}
