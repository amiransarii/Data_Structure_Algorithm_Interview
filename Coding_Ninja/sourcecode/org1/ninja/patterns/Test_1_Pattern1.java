package org1.ninja.patterns;
import java.util.Scanner;
/**
 * 
 * Problem statement
 * Print the following pattern for the given number of rows.
 * Pattern for N = 4
 *Sample Output 1:
           1
          232
         34543
        4567654
       567898765
 */
public class Test_1_Pattern1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int currRow = 1;
		while (currRow <= n) {
			int spaces = 1;
			while (spaces <= (n - currRow)) {
				System.out.print(" ");
				spaces += 1;
			}
			int currCol = 1;
			int valToPrint = currRow;
			while (currCol <= currRow) {
				System.out.print(valToPrint);
				valToPrint += 1;
				currCol += 1;
			}
			currCol = 1;
			valToPrint = 2 * currRow - 2;
			while (currCol <= currRow - 1) {
				System.out.print(valToPrint);
				valToPrint -= 1;
				currCol += 1;
			}
			System.out.println();
			currRow += 1;
		}
	}
}
