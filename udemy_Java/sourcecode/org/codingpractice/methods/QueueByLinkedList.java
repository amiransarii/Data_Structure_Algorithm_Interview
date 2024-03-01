package org.codingpractice.methods;

public class QueueByLinkedList {
	
	private SingleLinkedListOperation list;
	
	//constructor
	public QueueByLinkedList() {
		list = new SingleLinkedListOperation();
		
		int[] arr = new int[1000];
		int m = arr.length;
	}
	
	//add  items in queue
	 public void enQueue(int value) {
		 
		 String str = "amir";
		
		 
		 if(list.getHead() == null) {//empty list
		  list.createSingleLinkedList(value);
		 }
		 else { 
			 list.insertInLinkedList(value, list.getSize());;
		 }	 
	 }
	
	  //dequeue operation
	  public int deQueue() {
		  int value = -1;
		  
		  if(isQueuEmpty()) {
			  System.out.println("Queue underflow error!!");
		  }
		  else {
			  value = list.getHead().getValue();
			  list.deletionOfNode(0);
		  }
		  return value;
		  
		  
	  }
	 
	 
	  //peek element
	  public int peek() {
		  
		  if(!isQueuEmpty()) {
			  return list.getHead().getValue();
		  }
		  else {
			  System.out.println("The queue is empty!!");
				return -1;
		  }
		  
		  
	  }

	   //check linked list is empty
	   public boolean isQueuEmpty() {
		   if(list.getHead() == null)
			   return true;
		   
		   return false;
	   }
	  
	   public void deleteQueue() {
		   list.setHead(null);
	   }
}
