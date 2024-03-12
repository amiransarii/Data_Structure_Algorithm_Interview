package org94.ninja.stack.queue;

import java.util.Stack;

public class Test4BalancedBracket_Me {
public static boolean isBalanced(String expression) {
        
        Stack<Character> stack = new Stack<Character>();

        for(int j = 0; j < expression.length(); j++){
             char ch = expression.charAt(j);

          if( ch == '('){
              stack.push(ch);
          }
          else if (ch == ')'){
              if(stack.isEmpty()){
                  return false;
              }
              if(stack.peek() != '(')
              return false;
              else
                stack.pop();
          }
        }
        return stack.isEmpty();
    }
}
