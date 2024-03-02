package org1.ninja.patterns;
import java.util.Scanner;

/**
 * Problem statement
Print the following pattern for n number of rows.

Note: each line consist of equal number of characters + spaces. 
Suppose you are printing xth line for N=n. 
You need to print 1..x followed by (n-x) spaces, again (n-x) spaces followed by x..1
 * 
 *
 */
public class Test_3_Pattern3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int totalRows = s.nextInt();
		int totalSpaces = (2 * totalRows) - 2;
		int currentRow = 1;
		while (currentRow <= totalRows) {
			int count = 1, num = 1;
			while (count <= currentRow) {
				System.out.print(num);
				num++;
				count++;
			}
			int space = 1;
			while (space <= totalSpaces) {
				System.out.print(" ");
				space++;
			}
			num = num - 1;
			count = 1;
			while (count <= currentRow) {
				System.out.print(num);
				num--;
				count++;
			}
			currentRow++;
			System.out.println();
			totalSpaces -= 2;
		}
	}

}
