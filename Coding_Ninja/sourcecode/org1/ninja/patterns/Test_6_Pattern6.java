package org1.ninja.patterns;

/**
 * Problem statement
 * Print the following pattern for the given number of rows.
 * Pattern for N = 5
 1    2   3    4   5
 11   12  13   14  15
 21   22  23   24  25
 16   17  18   19  20
 6    7    8   9   10
Input format : N (Total no. of rows)
Output format : Pattern in N line
 * 
 *
 */
public class Test_6_Pattern6 {
	/*
	 * Input n - number of rows
	 */
	public static void printPattern(int n) {
		// startVaue will store start value for each row, initially it is 1
		int startValue = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = startValue; j < startValue + n; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
			if (i == (n + 1) / 2) {
				if (n % 2 != 0) {
					startValue = n * (n - 2) + 1;
				} else {
					startValue = n * (n - 1) + 1;
				}
			} else if (i > (n + 1) / 2) {
				startValue = startValue - 2 * n;
			} else {
				startValue = startValue + 2 * n;
			}
		}
	}

}
