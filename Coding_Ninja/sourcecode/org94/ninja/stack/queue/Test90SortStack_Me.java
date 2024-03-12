package org94.ninja.stack.queue;

import java.util.Stack;

public class Test90SortStack_Me {
public static void sortStack(Stack<Integer> stack){
		
		Stack<Integer> tmpStack = new Stack<Integer>();

		while(!stack.isEmpty()){

			//pop out the first element
			int tmp = stack.pop();

			//while temporary stack is not empty and
            // top of stack is lesser than temp

			while(!tmpStack.isEmpty() && tmpStack.peek() <tmp){
				// pop from temporary stack and 
				// push it to the input stack
				stack.push(tmpStack.pop());
			}
			// push temp in temporary of stack
			tmpStack.push(tmp);

		}

		while (!tmpStack.isEmpty()){
			System.out.print(tmpStack.pop() +" ");
		}

	}
}
