package org94.ninja.stack.queue;

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}

}


public class Test7QueueUsingLL_Me {
	//Define the data members

		private Node head; //front
		private Node  tail; //rear
		private int size;
		

		public Test7QueueUsingLL_Me() {
			head = null;
			tail = null;
			size = 0;
		}
		


		/*----------------- Public Functions of Stack -----------------*/


		public int getSize() { 
			return size;
	    }


	    public boolean isEmpty() { 
	    	return head == null;
	    }


	    public void enqueue(int data) {
			Node newNode = new Node(data);

			if(head == null){
				head = newNode;
				tail = newNode;
			}
			else{
				tail.next = newNode;
				tail = newNode;
			}
	    	size ++;
	    }


	    public int dequeue() {
	    	if(head == null || size == 0){
				return -1;
			}
			else{
				
			}
			int tmp = head.data;
			head = head.next;
			size --;
			return tmp;
	    }


	    public int front() {
	    	if(head == null){
				return -1;
			}
			return head.data;
	    }
}
