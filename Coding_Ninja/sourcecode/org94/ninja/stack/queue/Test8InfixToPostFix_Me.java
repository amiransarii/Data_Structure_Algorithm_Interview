package org94.ninja.stack.queue;

import java.util.Stack;

/*
 * Problem statement
Given an infix expression S in the form of a string. 
You need to convert and print that input expression in 
postfix form. After that, evaluate and print the result of given expression in next line.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= Length of S <= 100

Sample Input 1 :
3+4
Sample Output 1 :
34+
7
 */

public class Test8InfixToPostFix_Me {
	// Function to return precedence of operators
    static int prec(char c) {
        if (c == '^')
            return 3;
        else if (c == '/' || c == '*')
            return 2;
        else if (c == '+' || c == '-')
            return 1;
        else
            return -1;
    }

	// Function to return associativity of operators
    static char associativity(char c) {
        if (c == '^')
            return 'R';
        return 'L'; // Default to left-associative
    }
 

	public static void evaluatePostfix(char[] input){
	     StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();
 
        for (int i = 0; i < input.length; i++) {
            char c = input[i];
 
            // If the scanned character is an operand, add it to the output string.
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')) {
                result.append(c);
            }
            // If the scanned character is an ( push it to the stack.
            else if (c == '(') {
                stack.push(c);
            }
            // If the scanned character is an ) pop and add to the output string from the stack
            // until an ( is encountered.
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop(); // Pop (
            }
            // If an operator is scanned
            else {
                while (!stack.isEmpty() && (prec(input[i]) < prec(stack.peek()) ||
                                             prec(input[i]) == prec(stack.peek()) &&
                                                 associativity(input[i]) == 'L')) {
                    
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }
 
        // Pop all the remaining elements from the stack
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        
        System.out.println(result);
        System.out.println(getValue(result.toString()));

	}

    static int getValue(String exp)
    {
        // Create a stack
        Stack<Integer> stack = new Stack<>();
 
        // Scan all characters one by one
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
 
            // If the scanned character is an operand
            // (number here), push it to the stack.
            if (Character.isDigit(c))
                stack.push(c - '0');
 
            //  If the scanned character is an operator, pop
            //  two elements from stack apply the operator
            else {
                int val1 = stack.pop();
                int val2 = stack.pop();
 
                switch (c) {
                case '+':
                    stack.push(val2 + val1);
                    break;
                case '-':
                    stack.push(val2 - val1);
                    break;
                case '/':
                    stack.push(val2 / val1);
                    break;
                case '*':
                    stack.push(val2 * val1);
                    break;
                }
            }
        }
        return stack.pop();
    }
}
