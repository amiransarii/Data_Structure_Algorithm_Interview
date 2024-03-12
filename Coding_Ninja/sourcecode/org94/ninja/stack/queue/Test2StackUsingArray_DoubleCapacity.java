package org94.ninja.stack.queue;

import org.nininja.utils.StackEmptyException;
import org.nininja.utils.StackFullException;

public class Test2StackUsingArray_DoubleCapacity {
	private int data[];
	private int top; // is the index of topmost element of stack
	
	public Test2StackUsingArray_DoubleCapacity() {
		data = new int[10];
		top = -1;
	}
	
	public Test2StackUsingArray_DoubleCapacity(int capacity) {
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
//			// Stack Full
//			StackFullException e = new StackFullException();
//			throw e;
			doubleCapacity();
			
		}
		top++;
		data[top] = elem;
	}

	private void doubleCapacity() {
		int temp[] = data;
		data = new int[2 * temp.length];
		for(int i = 0; i <= top; i++){
			data[i] = temp[i];
		}
		
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
		
		Test2StackUsingArray_DoubleCapacity stack = new Test2StackUsingArray_DoubleCapacity(3);
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
