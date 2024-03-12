package org94.ninja.stack.queue;

import org.nininja.utils.StackEmptyException;
import org.nininja.utils.StackFullException;

public class Test1StackUsingArray {
	
	private int data[];
	private int top; // is the index of topmost element of stack
	
	public Test1StackUsingArray() {
		data = new int[10];
		top = -1;
	}
	
	public Test1StackUsingArray(int capacity) {
		data = new int[capacity];
		top = -1;
	}
	
	public  boolean isEmpty(){
//		if(top == -1){
//			return true;
//		}else{
//			return false;
//		}
		return (top == -1);
	}
	
	public int size(){
		return top + 1;	
		}
	
	public int top() throws StackEmptyException{
		if(size() == 0){
			//StackEmptyException
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		return data[top];
	}
	
	public void push(int elem) throws StackFullException{
		if(size() == data.length){
			// Stack Full
			StackFullException e = new StackFullException();
			throw e;			
		}
		top++;
		data[top] = elem;
	}

	public int pop() throws StackEmptyException{
		if(size() == 0){
			//StackEmptyException
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		int temp = data[top];
		top--;
		return temp;
		
	}
	
	public static void main(String[] args) throws StackFullException {		
		Test1StackUsingArray stack = new Test1StackUsingArray(5);
		for(int i = 1; i <= 5; i++){
			stack.push(i);
		}
		
		while(!stack.isEmpty()){
			try {
				System.out.println(stack.pop());
			} catch (StackEmptyException e) {
				// Never reach here
			}
		}

	}
}
