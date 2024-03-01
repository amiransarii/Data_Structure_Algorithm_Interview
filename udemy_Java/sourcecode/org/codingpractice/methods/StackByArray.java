package org.codingpractice.methods;

public class StackByArray {
	private int[] arr;
	private int topOfStack;//keeps track of the cell which is last occupied in Array, this will help in insertion/deletion
	private int size; // size of the array
	
	public StackByArray(int size) {
		this.size = size;
		this.topOfStack = -1;
		arr = new int [size];
		System.out.println("Successfully created an empty Stack of Size: "+size);
	}
	
	
	
	//insert item into stack
	public void push(int value) {
		//if array is full , show stack is over flow error
		if(isFullStack()) {
			System.out.println("Stack overflow error!!");
		}
		
		else {
			arr[topOfStack+1] = value;
			topOfStack++;
			System.out.println("Successfully inserted " + value + " in the stack");	
		}
	}
	
	//pop actio
	public void pop() {
		//if array is empty, show stack underflow error		
		if(isEmptyStack()) {
			System.out.println("Stack underflow error!!");
		}
		else {
			System.out.println("Poping value from Stack: " + arr[topOfStack] + "...");
			topOfStack--;
		}
		
		
	}
	 

	
	
	//check empty stack or not
	public boolean isEmptyStack() {
		//if top pointer is -1, the stack is empty
		 if(topOfStack == -1) {
			 return true;
		 }
		 return false;
	}
	
	   //check stack is full or not 
	   public boolean isFullStack() {
		   
		   if(topOfStack == size -1) {
			   System.out.println("Stack is full !");
				return true;
		   }
		   
		   return false;
	   }
	
	 //peek operation
	   public void peekOperation() {
		   
		   if(!isEmptyStack()) {
			   System.out.println("Top of Stack: " + arr[topOfStack]);
		   }
		   else {
			   System.out.println("The stack is empty!!");
		   }
		   System.out.println();
		   System.out.println();
		   
	   }
	
		public void deleteStack() {
			arr = null;
			System.out.println("Stack is successfully deleted");
		}//end of method
}
