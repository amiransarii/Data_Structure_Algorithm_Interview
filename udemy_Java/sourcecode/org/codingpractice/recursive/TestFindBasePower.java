package org.codingpractice.recursive;

public class TestFindBasePower {
	
	//find the power of base
	
	  static int findPower(int base,int num) {
		   
		  if(num < 0) {
			  throw new IllegalArgumentException("Num can not be negative");
		  }
		  
		  else if(num == 0) {
			  return 1;
		  }
		  
		  else  if(num == 1) {
			  return base;
		  }
		  
		  else {
			  return base*findPower(base, num - 1);
		  }  
	  }
	  
	  public static void main(String args[]) {
		  
		  int n = findPower(3, 4);
		  System.out.println("Power of 3 "+n);
		  
		  
		  
	  }

}
