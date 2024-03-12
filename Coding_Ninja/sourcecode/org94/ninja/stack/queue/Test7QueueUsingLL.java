package org94.ninja.stack.queue;
/**
 * Problem statement
Implement a Queue Data Structure specifically to store integer data using a Singly Linked List.

The data members should be private.

You need to implement the following public functions :

1. Constructor:
It initialises the data members as required.

2. enqueue(data) :
This function should take one argument of type integer. It enqueues the element into the queue and returns nothing.

3. dequeue() :
It dequeues/removes the element from the front of the queue and in turn, returns the element being dequeued or removed. In case the queue is empty, it returns -1.

4. front() :
It returns the element being kept at the front of the queue. In case the queue is empty, it returns -1.

5. getSize() :
It returns the size of the queue at any given instance of time.

6. isEmpty() :
It returns a boolean value indicating whether the queue is empty or not.

Operations Performed on the Stack:

Explain
Query-1(Denoted by an integer 1): Enqueues an integer data to the queue.

Query-2(Denoted by an integer 2): Dequeues the data kept at the front of the queue and returns it to the caller.

Query-3(Denoted by an integer 3): Fetches and returns the data being kept at the front of the queue but doesn't remove it, unlike the dequeue function.

Query-4(Denoted by an integer 4): Returns the current size of the queue.

Query-5(Denoted by an integer 5): Returns a boolean value denoting whether the queue is empty or not.
Detailed explanation ( Input/output format, Notes, Images )
Constraints:

Explain
1 <= q <= 10^5
1 <= x <= 5
-2^31 <= data <= 2^31 - 1 and data != -1

Where 'q' is the total number of queries being performed on the queue, 'x' is the range for every query and data represents the integer pushed into the queue. 

Time Limit: 1 second
Sample Input 1:

Explain
7
1 17
1 23
1 11
2
2
2
2
Sample Output 1:
17
23
11
-1
Sample Input 2:
3
2
1 10
4
Sample Output 2:
-1 
1
 */

/*
Time complexity: O(1) [for all operations]
Space complexity: O(N)
where N is the number of operations
*/



public class Test7QueueUsingLL {
	private Node head;
	private Node tail;
	private int size;
	public Test7QueueUsingLL() {
	this.head = null;
	this.tail = null;
	this.size = 0;
	}
	public int getSize() {
	return this.size;
	}
	public boolean isEmpty() {
	return this.size == 0;
	}
	public void enqueue(int data) {
	this.size += 1;
	Node newNode = new Node(data);
	if (head == null) {
	this.head = newNode;
	this.tail = newNode;
	return;
	}
	this.tail.next = newNode;
	this.tail = newNode;
	}
	public int dequeue() {
	if (this.isEmpty()) {
	return -1;
	}
	int ans = this.head.data;
	this.head = this.head.next;
	this.size -= 1;
	return ans;
	}
	public int front() {
	if (this.isEmpty()) {
	return -1;
	}
	return this.head.data;
	}
}