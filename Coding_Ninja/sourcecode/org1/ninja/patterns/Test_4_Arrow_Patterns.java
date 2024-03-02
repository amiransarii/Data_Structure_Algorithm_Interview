package org1.ninja.patterns;
import java.util.Scanner;

/**
 * Problem statement
 * Print the following pattern for the given number of rows.
 * Assume N is always odd.
 * Note : There is space after every star. Pattern for N = 7

Explain
*
 * *
   * * *
     * * * *
   * * *
 * *
*
 * 
 *
 */
public class Test_4_Arrow_Patterns {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int n1 = n / 2 + 1;
		for (int i = 1; i <= n1; i++) {
			for (int j = 1; j < i; j++)
				System.out.print(" ");
			for (int k = 1; k <= i; k++)
				System.out.print("* ");
			System.out.println();
		}
		for (int i = n1 - 1; i >= 1; i--) {
			for (int j = 1; j < i; j++)
				System.out.print(" ");
			for (int k = 1; k <= i; k++)
				System.out.print("* ");
			System.out.println();
		}
	}
}
