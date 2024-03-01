package org.codingpractice.recursive;

public class TestPrintNumber {
	
	static void printNumber(int num){
		
		if(num < 1) //base case
			return; //stop calling method
		
		else {
			System.out.print(num +" ");
			printNumber(num - 1);
		}
	}
	
	public static void main(String args[]) {
		printNumber(5);
	}

}
