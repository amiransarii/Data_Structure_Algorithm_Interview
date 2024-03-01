package org.codingpractice.recursive;

//find the factorial of number using recursive
public class TestFactorialNumber {
	
	
	static int findFact(int n) {
		
		 //base case
		    
		 if( n == 0 || n == 1 || n <1)
			 return 1;
		 
		 return n*findFact(n - 1);
		
		
	}
	
	public static void main(String args[]) {
		
		int num = 6;
		
         int fact = findFact(num);
         System.out.println("Factoial of 5 is "+fact);
         
		
		
	}

}
