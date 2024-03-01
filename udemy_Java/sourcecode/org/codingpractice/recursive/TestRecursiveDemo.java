package org.codingpractice.recursive;

public class TestRecursiveDemo {
	
	public static void main(String args[]) {
		int n= 10;
		reducedByOne(n);
	}

	
	 static void reducedByOne(int n) {
		 
		 if( n >= 0) {
			 reducedByOne(n - 1);
		 }
		 System.out.println("Compeleted Call "+n);
		 
	 }
}
