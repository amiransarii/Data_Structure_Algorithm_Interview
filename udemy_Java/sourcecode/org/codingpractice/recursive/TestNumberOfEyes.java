package org.codingpractice.recursive;

public class TestNumberOfEyes {
	
	     static int numberOfEyes(int men) {
	    	 
	    	  //base case
	    	  if(men == 0) // number of men  zero
	    		  return 0;
	    	  
	    	  else if(men == 1)
	    		  return 2;
	    	  
	    	  else {
	    		  return 2 +numberOfEyes(men - 1);
	    	  }
	    	    }
	     
	     public static void main(String args[]) {
	    	 
	    	 int men = 6;
	    	 int eyes = numberOfEyes(men);
	    	 System.out.println(eyes);
	    	 
	     }

}
