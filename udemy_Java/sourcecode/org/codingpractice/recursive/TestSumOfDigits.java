package org.codingpractice.recursive;

//calculate sum of digits
public class TestSumOfDigits {
	
	static int sum =0;
	static int getSum(int num) {
		
		if(num < 0)
			num = num*-1;
		
		if(num == 0)
			return 0;
		
		else if(num <= 9)
			return num;
		
		else {
			return sum + num % 10 + getSum(num /10); 
		}	
	}
	
	public static void main(String args[]) {
		
		int n = 123;
		int sum = getSum(n);
		
		System.out.println("Sum of Digits "+sum);
	}

}
