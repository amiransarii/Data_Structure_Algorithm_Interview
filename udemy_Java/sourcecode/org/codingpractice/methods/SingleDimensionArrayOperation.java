package org.codingpractice.methods;

/**
 * 
 * @author amir.ansari implements of all the single array operations like
 *         insertion ,deletion,searching etc.
 */
public class SingleDimensionArrayOperation {

	private int[] arr; // intialize array
	private int size; // size of the array

	// constructor
	public SingleDimensionArrayOperation(int size) {
		// size of the array
		arr = new int[size];
		this.size = size;

		// add min value to array
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.MIN_VALUE;
		}
	}

	// traver the array
	public void traverseArray() {
		
		 try {
			 for(int i = 0 ; i < size; i++) {
				 
				 System.out.print(arr[i] +" ");
			     		
				}
		 }
		 catch(Exception e) {
			 System.out.println("Array no longer exists !");
		 }
	}
	 
	    // insert value in the array
	     public void insertValue(int location, int value) {
	    	 
	    	 try {
	    		  if(arr[location] == Integer.MIN_VALUE) {
	    			  arr[location] = value;
	    			  System.out.println("Successfully inserted " + value + " at location: " + location);
	    		  }
	    		  else {
	    			  System.out.println("Value already existed at index "+location);
	    		  }
	    	 } catch(ArrayIndexOutOfBoundsException e) {
	    		 System.out.println("Invalid index to access array ! "+location);
	    		 
	    	 }  	 
	     }
	     
	  // Access a particular element of an array at location
	     public void accessingCellValue(int location) {
	    	  
	    	 try {
	    		 System.out.println("Value at "+location +" "+ arr[location]);
	    	 } 
	    	 catch(ArrayIndexOutOfBoundsException e) {
	    		 System.out.println("Invalid index to access array ! "+location);
	    	 }
	    	 
	     }
	     
	   //Search for an element in the given Array
	     public void searchInArray(int searchElement) {
	    	 for(int i = 0 ; i < size; i++) {
	    		 
	    		 if(arr[i] == searchElement) {
	    			 System.out.println("Value found !");
	 				System.out.println("Index of " + searchElement + " is: " + i);
	 				return;
	    		 }
	    		 
	    	 }
	    	 System.out.println(searchElement + " is not found!!");
	     }
	     
	     
	   //Delete value from given Array
	     public void deleteValueFromArray(int deleteValueIndex) {
	    	  
	    	 try {
	    		  arr[deleteValueIndex] = Integer.MIN_VALUE;
	    	 }
	    	 catch(ArrayIndexOutOfBoundsException e) {
	    		 System.out.println();
	 			System.out.println("Cant delete the value as cell# provided is not in the range of array !");
	    	 }    	 
	     }
	     
	     //delete entire array
	     public void deleteEntireArray() {
	    	 arr = null;
	    	 System.out.println("Array has been succefully deleted");
	     }

}
