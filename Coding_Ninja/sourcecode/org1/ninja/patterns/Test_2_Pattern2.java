package org1.ninja.patterns;
import java.util.Scanner;

/**
 * Print the following pattern
 * Pattern for N = 4
 * 
 *
 */
public class Test_2_Pattern2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while (i <= n) {
			int spaces = 1;
			while (spaces <= n - i) {
				System.out.print(" ");
				spaces = spaces + 1;
			}
			int col = 1;
			int value = i;
			while (col <= i) {
				System.out.print(value);
				value = value + 1;
				col = col + 1;
			}
			System.out.println();
			i = i + 1;
		}
	}
}
