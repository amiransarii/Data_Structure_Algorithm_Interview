package org94.ninja.stack.queue;
import java.util.Queue;
import java.util.LinkedList;

/*
 * Problem statement
Implement a Stack Data Structure specifically to store integer data using two Queues. You have to implement it in such a way that the push operation is done in O(1) time and the pop and top operations are done in O(N) time.

There should be two data members, both being Queues to store the data internally. You may use the inbuilt Queue.

Implement the following public functions :

1. Constructor:
It initialises the data members as required.

2. push(data) :
This function should take one argument of type integer. It pushes the element into the stack and returns nothing.

3. pop() :
It pops the element from the top of the stack and in turn, returns the element being popped or deleted. In case the stack is empty, it returns -1.

4. top :
It returns the element being kept at the top of the stack. In case the stack is empty, it returns -1.

5. size() :
It returns the size of the stack at any given instance of time.

6. isEmpty() :
It returns a boolean value indicating whether the stack is empty or not.

Operations Performed on the Stack:

Explain
Query-1(Denoted by an integer 1): Pushes an integer data to the stack.

Query-2(Denoted by an integer 2): Pops the data kept at the top of the stack and returns it to the caller.

Query-3(Denoted by an integer 3): Fetches and returns the data being kept at the top of the stack but doesn't remove it, unlike the pop function.

Query-4(Denoted by an integer 4): Returns the current size of the stack.

Query-5(Denoted by an integer 5): Returns a boolean value denoting whether the stack is empty or not.
Detailed explanation ( Input/output format, Notes, Images )
Constraints:

Explain
1 <= q <= 100
1 <= x <= 5
-2^31 <= data <= 2^31 - 1 and data != -1

Where 'q' is the total number of queries being performed on the stack, 'x' is the range for every query and data represents the integer pushed into the stack. 

Time Limit: 1 second
Sample Input 1:

Explain
6
1 13
1 47
4
5
2
3
Sample Output 1:

Explain
2
false
47
13

Explanation: The operations are as follows:
Push 13 into the stack.
Push 47 into the stack.
Print the size of the stack. Since we have pushed two elements, the size is 2.
Check if the stack is empty. Since there are elements in the stack, it returns false.
Pop the top element from the stack. The top element is 47, so it is removed and returned.
Fetch and return the top element of the stack. Now, the top element is 13, so 13 is returned.
So, the output for this test case is 2 false 47 13.
Sample Input 2:
4
5
2
1 10
5
 Sample Output 2:

Explain
true
-1
false

Explanation: The operations are as follows:
Check if the stack is empty. Since no elements have been pushed yet, it returns true.
Try to pop the top element from the stack. Since the stack is empty, it returns -1.
Push 10 into the stack.
Check if the stack is empty. Since there is one element in the stack, it returns false.
So, the output for this test case is true -1 false.

 */

/*
Time complexity: O(N) for pop and top operations; O(1) for all other operations
Space complexity: O(N)
where N is the number of operations
*/


public class Test93StackUsingTwoQueues {
	public Queue<Integer> q1;
	public Queue<Integer> q2;
	public Test93StackUsingTwoQueues() {
	this.q1 = new LinkedList<>();
	this.q2 = new LinkedList<>();
	}
	public int getSize() {
	return this.q1.size();
	}
	public boolean isEmpty() {
	return this.getSize() == 0;
	}
	public void push(int element) {
	this.q1.add(element);
	}
	public int pop() {
	if (this.isEmpty()) {
	return -1;
	}
	while (this.q1.size() > 1) {
	this.q2.add(this.q1.poll());
	}
	int ans = this.q1.poll();
	Queue<Integer> temp = this.q1;
	this.q1 = this.q2;
	this.q2 = temp;
	return ans;
	}
	public int top() {
	if (this.isEmpty()) {
	return -1;
	}
	while (this.q1.size() > 1) {
	this.q2.add(this.q1.poll());
	}
	int ans = q1.poll();
	q2.add(ans);
	Queue<Integer> temp = this.q1;
	this.q1 = this.q2;
	this.q2 = temp;
	return ans;
	}

}
