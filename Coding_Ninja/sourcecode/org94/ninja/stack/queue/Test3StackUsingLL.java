package org94.ninja.stack.queue;
import org.nininja.utils.Node;
import org.nininja.utils.StackEmptyException;
import org.nininja.utils.StackFullException;


public class Test3StackUsingLL<T>  {
	private Node<T> head;
	private int size;

	public Test3StackUsingLL() {
		head = null;
		size = 0;	
	}

	int size(){
		return size;
	}
	boolean isEmpty(){
		return size() == 0; // head == null
	}

	T top() throws StackEmptyException{
		if(size() == 0){
			//StackEmptyException e = new StackEmptyException();
			//throw e;
			throw new StackEmptyException();
		}
		return head.data;
	}

	void push(T element){
		
		Node<T> newNode = new Node<T>(element);
		newNode.next = head;
		head = newNode;
		size++;
		
	}

	T pop() throws StackEmptyException{
		if(size() == 0){
			//StackEmptyException e = new StackEmptyException();
			//throw e;
			throw new StackEmptyException();
		}
		T tempdata = head.data;
		head = head.next;
		size--;
		return tempdata;
	
	}


	
public static void main(String[] args) throws StackFullException {
		
	Test3StackUsingLL<Integer> stack = new Test3StackUsingLL<>();
		
//		StackUsingArray stack = new StackUsingArray(3);
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
