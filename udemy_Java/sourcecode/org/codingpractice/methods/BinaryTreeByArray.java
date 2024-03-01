package org.codingpractice.methods;

public class BinaryTreeByArray {
	
	private int[] arr;
	private int lastUsedIndex;
	
	//constructor for blank Tree
	public BinaryTreeByArray(int size) {
		arr = new int[size +1]; //array index start from 1
		this.lastUsedIndex =0;
		System.out.println("Blank Tree of size " +size+ " has been created !\n");
	}
	
	// check if array is full
	 boolean isTreeFull() {
		 if(arr.length -1 == lastUsedIndex) {
			 return true;
		 }
		 else {
			 return false;
		 }	 
	 }
	 
	// New node should be inserted at the first empty place in the array
	 public void insert(int value) {
		  if(!isTreeFull()) {
			  arr[lastUsedIndex +1] = value;
			  lastUsedIndex++;
			  System.out.println("Successfully inserted "+value+ " in the tree!");
		  }
		  else {
			  System.out.println("Could not insert value in the Tree as it is full !");
		  }
	 }
	 
	 
	 //level-Order traversal of binary tree
	  public void levelOrder() {
		  for(int i = 1 ; i <= lastUsedIndex ; i++) {
			  System.out.print(arr[i] +" ");
		  }	  
	  }
	 
	// Pre-Order traversal of binary tree
	  public void preOrder(int index) {
		   
		  if(index > lastUsedIndex)
			  return;
		  
		  System.out.print(arr[index] +" ");
		  preOrder(2*index);
		  preOrder(2*index +1);
	  }
	  
	  
	  //post order
	   public void postOrder(int index) {
		   
		   if(index > lastUsedIndex)
			   return;
		   
		   postOrder(2*index);
		   postOrder(2*index +1);
		   System.out.print(arr[index] +" ");
		   	 
	   }
	   
	   //in order traversal
	   public void inOrder(int index) {
		   
		   if(index > lastUsedIndex)
			   return;
		   
		    inOrder(2*index);
		    System.out.print(arr[index] +" ");
		    inOrder(2*index +1);
		   		   
	   }
	 
	 
	// Do a linear search on the array 
	   public int search(int value) {
		   
		   for(int i = 0; i <= lastUsedIndex ; i++) {
			   
			   if(arr[i] == value) {
				 System.out.print(value +" exists in the Tree! ");
				 System.out.println("It is at the location: " + i);
				 return i;
			   }			   
		   }
		   System.out.println(value + " does not exists in Tree !");
			System.out.println();
			return -1;  
		   
	   }
	 
	  // delete operation of binary tree
	   public void delete(int value) {
		   
		   int location = search(value);
		   
		   //if value does not exist
		   if(location == -1) {
			   return;
		   }
		   else {
			 //insert last element of the Tree into current location
			   arr[location] = arr[lastUsedIndex];
			   lastUsedIndex --;
			   System.out.println("Successfully deleted " + value + " from the Tree !");		   
		   }
		 
	   }
	   
	    //delete tree
	    public void deleteTree() {
	    	
	    	try {
	    		arr = null;
	    		System.out.println("Tree has been deleted successfully !");
	    	}
	    	catch(Exception e) {
	    		System.out.println("There was an error deleting the tree.");
	    	}
	    	
	    }
	   
	   
	 

}
