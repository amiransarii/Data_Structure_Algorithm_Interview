package org.codingpractice.recursive;

public class TestFindFiboNumber {
	
	static int findFiboNumber(int n) {
		
		if( n < 1)
			throw new IllegalArgumentException("n can not negtaive");
		
		else if( n == 1 || n == 2)
			return n - 1;
		
		else {
			return findFiboNumber(n -1) + findFiboNumber(n - 2);
		}
		
	}
	
	public static void main(String args[]) {
		
		int fibNumber = findFiboNumber(5);
		System.out.println(fibNumber);
		
	}

}
