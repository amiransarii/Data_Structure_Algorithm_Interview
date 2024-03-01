package org.codingpractice.queue;

import java.util.LinkedList;
import java.util.Queue;

public class TestImplementStackUsingQueuesPop {
	/*
	 * In push operation, the new element is always enqueued to q1. In pop()
	 * operation, if q2 is empty then all the elements except the last, are moved to
	 * q2. Finally the last element is dequeued from q1 and returned.
	 * 
	 * push(s, x) operation: Enqueue x to q1 (assuming size of q1 is unlimited).
	 * pop(s) operation: One by one dequeue everything except the last element from
	 * q1 and enqueue to q2. Dequeue the last item of q1, the dequeued item is
	 * result, store it. Swap the names of q1 and q2 Return the item stored in step
	 * 2.
	 */
	
	private Queue<Integer>q1 = new LinkedList<Integer>();
	private Queue<Integer> q2 = new LinkedList<Integer>();
	int curr_Size = 0;
	
	public TestImplementStackUsingQueuesPop() {
		curr_Size = 0;
	}
	
	void remove() {
		
		if(q1.isEmpty())
			return ;
		
		// Leave one element in q1 and 
        // push others in q2. 
		while(q1.size() != 1) {
			q2.add(q1.peek());
			q1.remove();
		}
		
		 // Pop the only left element 
        // from q1 
		q1.remove();
		curr_Size --;
		
	 // swap the names of two queues 
	 Queue<Integer> q = q1;
	 q1 = q2;
	 q2 = q;
	 	
	}
	
	  void add(int x) 
	    { 
	        q1.add(x); 
	        curr_Size++; 
	    } 
	  
}
