package org1.ninja.patterns;

/**
 * Problem statement
 * Print the following pattern
 * Pattern for N = 4
 * 4 4 4 4 4 4 4 
   4 3 3 3 3 3 4 
   4 3 2 2 2 3 4 
   4 3 2 1 2 3 4 
   4 3 2 2 2 3 4 
   4 3 3 3 3 3 4 
   4 4 4 4 4 4 4 
 * 
 *
 */
public class Test_5_Number_Pattern5 {
	public static void printPattern(int n) {
		int num = n;
		int count = 2 * n - 1;
		for (int i = 1; i <= 2 * n - 1; i++) {
			for (int j = n; j > num; j--) {
				System.out.print(j + " ");
			}
			for (int j = 1; j <= count; j++) {
				System.out.print(num + " ");
			}
			for (int j = num + 1; j <= n; j++) {
				System.out.print(j + " ");
			}
			if (i < n) {
				num--;
				count = count - 2;
			} else {
				num++;
				count = count + 2;
			}
			System.out.println();
		}
	}

}
