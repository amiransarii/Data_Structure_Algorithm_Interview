package org.codingpractice.queue;

public class TestQueueArray {
	
	private int front;
	private int rear;
	private int size;
	private int capacity;
	private int[] arr;
	
	//create constructor
	public TestQueueArray(int capacity) {
		this.capacity = capacity;
		front = this.size= 0;
		rear = capacity - 1;
		arr = new int[capacity];
		
	}
	
	//check queue is full when size becomes equals to capacity
	 boolean isFull(TestQueueArray queue) {
		 return (queue.size == queue.capacity);
	 }
	 
	 //check queue is empty when size is 0
	 boolean isEmpty(TestQueueArray queue) {
		 return (queue.size == 0);
	 }
	 
	// Method to add an item to the queue.  
	// It changes rear and size 
	void enqueue(int item) {
		
		if(isFull(this))
			return;
		
		this.rear =(this.rear +1) % this.capacity;
		this.arr[this.rear] = item;
		this.size = this.size +1;
		 System.out.println(item+ " enqueued to queue"); 		
	}
	
	// Method to remove an item from queue.   
    // It changes front and size 
	int dequeu() {
		
		if(isEmpty(this))
			return Integer.MIN_VALUE;
		
		int item = this.arr[this.front];
		this.front = (this.front +1) %this.capacity;
		this.size = this.size -1;
		
		return item;
		
	}
	
	// Method to get front of queue 
	int front() {
		
		if(isEmpty(this))
			return Integer.MIN_VALUE;
		
		return this.arr[this.front];
	}
	
	 // Method to get rear of queue 
	int rear() {
		
		if(isEmpty(this)) {
			return Integer.MIN_VALUE;
		}
		
		return this.arr[this.rear];
		
	}

	
	    public static void main(String[] args)  
	    { 
	    	TestQueueArray queue = new TestQueueArray(1000); 
	            
	        queue.enqueue(10); 
	        queue.enqueue(20); 
	        queue.enqueue(30); 
	        queue.enqueue(40); 
	        
	        System.out.println(queue.dequeu() +  
	                     " dequeued from queue\n"); 
	        
	        System.out.println("Front item is " +  
	                               queue.front()); 
	           
	        System.out.println("Rear item is " +  
	                                queue.rear()); 
	    } 
	 
	  
}
