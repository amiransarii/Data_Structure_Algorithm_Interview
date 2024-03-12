package org94.ninja.stack.queue;

import org.nininja.utils.Node;
import org.nininja.utils.QueueEmptyException;

public class Test7QueueUsingLinkedList<T> {
	private Node<T> front;
	private Node<T> rear;
	private int size;

	public Test7QueueUsingLinkedList() {
		front = null;
		rear = null;
		size = 0;
	}
	int size(){
		return size;
	}

	boolean isEmpty(){
		return size == 0;
	}

	T front() throws QueueEmptyException{
		if(size == 0){
			throw new QueueEmptyException();
		}	
		return front.data;
	}

	void enqueue(T element){
		Node<T> newNode = new Node<>(element);
		if(rear == null){
			front = newNode;
			rear = newNode;
		}else{
			rear.next = newNode;
			rear = newNode;
		}
		size++;

	}

	T dequeue() throws QueueEmptyException{
		if(size == 0){
			throw new QueueEmptyException();
		}	
		
		T temp = front.data;
		front = front.next;
		if(size == 1){
			rear = null;
		}
		size--;
		
		return temp;
	}

	public static void main(String[] args) {
//		QueueUsingArray queue = new QueueUsingArray(3);
		Test7QueueUsingLinkedList<Integer> queue = new Test7QueueUsingLinkedList<>();
		for(int i = 1; i <= 5; i++){
			queue.enqueue(i);
//			try {
//				queue.enqueue(i);
//			} catch (QueueFullException e) {
//				
//			}
		}
		
		
		while(! queue.isEmpty()){
			try {
				System.out.println(queue.dequeue());
			} catch (QueueEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
