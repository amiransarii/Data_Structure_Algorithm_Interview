package org7.ninja.recursion2;
/*
 * Problem statement
Given n pairs of parentheses, write a function to generate and print all combinations of well-formed parentheses. That is, you need to generate all possible valid set of parenthesis that can be formed with given number of pairs.

Detailed explanation ( Input/output format, Notes, Images )
Input format :
Integer n
Output format :
Print all possible valid parenthesis in different lines
Note: Order in which different combinations of well-formed parentheses are printed in different lines doesn't matter.

Constraints :
1 <= n <= 10

Sample Input :
3
Sample Output :
((()))
(()())
(())()
()(())
()()()

 */
public class Test96parentheses {
	public static void printWellFormedParanthesis( int n){
		char[] str = new char[2 * n];
		printWellFormedParanthesis(str, n);

	}
	static void printWellFormedParanthesis(char str[], int pos,
                                  int n, int open,
                                  int close)
    {
        if (close == n) {
            // print the possible combinations
            for (int i = 0; i < str.length; i++)
                System.out.print(str[i]);
            System.out.println();
            return;
        }
        else {
            if (open > close) {
                str[pos] = ')';
                printWellFormedParanthesis(str, pos + 1, n, open,
                                  close + 1);
            }
            if (open < n) {
                str[pos] = '(';
                printWellFormedParanthesis(str, pos + 1, n, open + 1,
                                  close);
            }
        }
    }
 
    // Wrapper over printWellFormedParanthesis()
    static void printWellFormedParanthesis(char str[], int n)
    {
        if (n > 0)
           printWellFormedParanthesis(str, 0, n, 0, 0);
        return;
    }
}
//https://prepinsta.com/python-program/generate-all-combinations-of-balanced-parentheses/
//https://www.geeksforgeeks.org/print-all-combinations-of-balanced-parentheses/