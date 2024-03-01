package org.codingpractice.recursive;

//find the elements from linear search
public class TestLinearSearch {
	
	static int getElements(int [] arr, int key, int i, int n) {
		
		      if(i > n -1) {  //base case
		    	  return -1;
		      }
		      
		      else if(arr[i] == key) {
		    	  return i;
		      }
		      else if(i == n - 1 && arr[i] == key) {
		    	  return -1;
		      }
		    	     
		      else {
		    	  return getElements(arr, key, i+1, n);
		      }		
	}
	
	 public static void main(String args[]) {
		 int[] arr = {1,2,3,10,4,6,8,9};
		 int key = 88;
		 int i = 0;
		 int n = 8;
		  
		 int index   = getElements(arr,key,i,8);
		 
		 System.out.println("Index Existed "+index);
		 
	 }

}
