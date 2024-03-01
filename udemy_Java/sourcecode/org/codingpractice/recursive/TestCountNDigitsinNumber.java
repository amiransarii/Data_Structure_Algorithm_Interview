package org.codingpractice.recursive;

//count the n digits in numbers
public class TestCountNDigitsinNumber {
	
	
	 static int getNDigit(int n,int number) {
		 
		  if(number <0) {
			  number = number*-1;
		  }
		  
		  if(number == 0) {
			  return 0;
		  }
		  
		  else if(number <=9) { //single digit
			   
			  if(number == n)
				  return 1;
			  else {
				  return 0;
			  }
			  
		  }
		  else {
			  
			  if(number %10 == n)
				  return 1 + getNDigit(n, number/10);
			  else
				  return 0 + getNDigit(n, number/10);
		  }		 
	 }
	 
	 public static void main(String arhs[]) {
		 
		 int number = 1235343;
		 int n = 3;
		 
		 int digits = getNDigit(n, number);
		 System.out.println(digits);
		 
	 }

}
