package org94.ninja.stack.queue;

import java.util.Stack;

/**
 * Problem statement
Given a stack, sort the elements inside that stack in ascending order using only push and pop operation. You can use one additional stack only.

For eg.


Explain
Input Stack :  5 (top)
               4
               3
               2
               1
Output Stack : 1 (top)
               2
               3
               4
               5
Detailed explanation ( Input/output format, Notes, Images )
Constraints
0 <= N <= 1000
Time limit: 1 sec
Sample Input
5
1 2 3 4 5
Sample Output
1 2 3 4 5
 *
 */

/*
Time complexity: O(N^2)
Space complexity: O(N)
where N is the size of the input stack
*/


public class Test90SortStack {
	public static void sortStack(Stack<Integer> stack){
		if(stack.size() <= 1){
		return;
		}
		Stack<Integer> helper = new Stack<>();
		int n = stack.size();
		for (int i = 0; i < n; i++) {
		// pop till all elements in stack are greater than top
		int max = Integer.MIN_VALUE;
		boolean maxSkipped = false;
		for (int j = 0; j < n - i; j++) {
		int element = stack.pop();
		if (element > max) {
		max = element;
		}
		helper.push(element);
		}
		stack.push(max);
		while (!helper.isEmpty()) {
		int element = helper.pop();
		if (element != max || maxSkipped) {
		stack.push(element);
		} else {
		/* Set this to true as we have added the max element
		already in the array once,
		* but if there are multiple copies of max then we
		should push them to stack */
		maxSkipped = true;
		}
		}
		}
		}
		
}
