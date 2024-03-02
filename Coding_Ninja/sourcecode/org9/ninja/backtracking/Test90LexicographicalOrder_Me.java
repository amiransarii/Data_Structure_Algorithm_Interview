package org9.ninja.backtracking;

/*
 * Problem statement
Given a number n, print numbers from 1 to n in dictionary(lexicographical) order.

Sample Input
20
Sample Output

Explain
1
10
11
12
13
14
15
16
17
18
19
2
20
3
4
5
6
7
8
9
 */
public class Test90LexicographicalOrder_Me {
	public static void lexicographicalOrder(int num) {
		for (int i = 1; i <= 9; i++) {
			lexicographicalOrderHelper(i, num);
		}
	}

	private static void lexicographicalOrderHelper(int numberSoFar, int num) {
		if (numberSoFar > num) {
			return;
		}
		System.out.println(numberSoFar);
		for (int i = 0; i <= 9; i++) {
			lexicographicalOrderHelper(numberSoFar * 10 + i, num);
		}
}
}
