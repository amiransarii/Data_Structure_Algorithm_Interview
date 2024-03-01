package org.codingpractice.methods;

import org.codingpractice.entity.SingleNode;

public class StackByLinkedList {
	
	private SingleLinkedListOperation list;
	
	 
	//constructor
	public StackByLinkedList() {
		list = new SingleLinkedListOperation();
	}
	
	  
	//push operatipn
	public void push(int value) {
		
		//check empty list or not
		if(list.getHead() == null) { //empty list
			list.createSingleLinkedList(value);
		}
		else { //insert into stack
			list.insertInLinkedList(value, 0); //make a new node  as head
		}
		System.out.println("Inserted " + value + " in Stack !");
		
	}
	
	//pop operation
	public int pop() {
		int value = -1;
		
		if(isEmpty()) {
			System.out.println("Stack underflow error!!");
		}
		else {
			value = list.getHead().getValue();
			list.deletionOfNode(0);
		}
		return value;
		
	}
	 
	
	
	//check empty
	public boolean isEmpty() {
		return list.getHead() == null;
	}
	
	
	 //peek operation -> get element of head
	 public int peek() {
		 
		 if(!isEmpty()) {
			 return list.getHead().getValue();
		 }
		 else {
				System.out.println("The stack is empty!!");
				return -1;
			}
	 }
	
	 //delete stack
	 public void deleteStack() {
		 list.setHead(null);
	 }
	

}
