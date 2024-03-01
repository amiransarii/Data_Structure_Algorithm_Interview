package org.codingpractice.queue;

import java.util.LinkedList;
import java.util.Queue;

public class TestStackUsingSingleQueue {
	
	Queue<Integer> q = new LinkedList<Integer>();
	
	//push operation
	void push(int val) {
		
		//get previous size of queuue
		int size = q.size();
		
		//add current element
		q.add(val);
		
		//pop (or dequeue) all previous element
		// and put them after current element
		
		for(int i =  0 ; i < size ; i++) {
			//this will add front element into
			//rear of queue
			int x = q.remove();
			q.add(x);
		}
		
}
	
	// Removes the top element 
	 
	int pop() {
		if(q.isEmpty())
		{
			 System.out.println("No elements"); 
		        return -1; 
		}
		
        int x = q.remove();    
        return x;
		//return q.peek();
	}
	
	//return top of the stack
	int top() {
		if(q.isEmpty())
			return -1;
		
		return q.peek();
	}
	
	  // Returns true if Stack is empty else false 
	boolean isEmpty() {
		return q.isEmpty();
	}
	
	 // Driver program to test above methods 
    public static void main(String[] args)  
    { 
    	TestStackUsingSingleQueue s = new TestStackUsingSingleQueue(); 
        s.push(10); 
        s.push(20); 
        System.out.println("Top element :" + s.top()); 
        s.pop(); 
        s.push(30); 
        s.pop(); 
        System.out.println("Top element :" + s.top()); 
    } 
}
