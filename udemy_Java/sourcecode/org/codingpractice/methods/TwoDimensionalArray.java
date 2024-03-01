package org.codingpractice.methods;

public class TwoDimensionalArray {
 //initialize two dimension array
	private int[][] arr;
	private int size ;
	
	
	//constructor
	public TwoDimensionalArray(int noOfRows, int noOfColumns) {
		this.arr = new int[noOfRows][noOfColumns];
		size = arr.length;
		
		//initialize some  value in array
		for(int row = 0 ; row < size ; row++) {
			
			for(int col = 0 ; col < arr[0].length; col++) {
				arr[row][col] = Integer.MIN_VALUE;
			}	
		}
	}
	
	   //traverse the array
	public void traverseArray() {
		
		try {
			System.out.println("Printing the array now...");
			
			for(int row = 0 ; row < size; row ++) {
				
				for(int col = 0 ; col < arr[0].length; col++) {
					System.out.println(arr[row][col] +" ");
				}
			}
			System.out.println("\n");
		}
		catch(Exception e) {
			System.out.println("Array does not exists");
		}	
	}
	
	// Inserting value in the Array
	public void insertValueInArray(int row, int col, int value) {
		
		  try {
			   if(arr[row][col] == Integer.MIN_VALUE) {
				   arr[row][col] = value;
				   System.out.println("Successfully inserted " + value + " in the array.");
			   }
			   else  {
				   System.out.println("This cell is already occupied by another value.");
			   }
		  }
		  
		  catch(ArrayIndexOutOfBoundsException e) {
			  System.out.println("Invalid index to access array !");
				// e.printStackTrace();
		  }
	}
	
	// Accessing single value from given array
	 public void accessSingleCell(int row, int col) {
		 System.out.println("\nAccessing Row#" + row + ", Col#" + col + "...");
		 
		 try {
			 System.out.println("Cell value is: " + arr[row][col]);
		 }
		 catch(ArrayIndexOutOfBoundsException e) {
			 System.out.println("Invalid index to access array !");
		 }
		 System.out.println();
	 }
	 
	// Searching a single value from the Array
		public void searchingSingleValue(int value) {
			System.out.println("\nSearching value " + value + " in the array");
			for (int row = 0; row < arr.length; row++) {
				for (int col = 0; col < arr[0].length; col++) {
					if (arr[row][col] == value) {
						System.out.println("Value is founud at location Row:" + row + " & Col:" + col + "\n\n");
						return;
					}
				}
			}
			System.out.println("Value is not found in Array\n");

		}
		
		// Deleting a value from Array
		public void deleteValueFromArray(int deleteValueFromThisRow, int deleteValueFromThisCol) {
			System.out.println(
					"Deleting value from Row#" + deleteValueFromThisRow + " & Col#" + deleteValueFromThisCol + "...");
			try {
				System.out.println("Successfully deleted: " + arr[deleteValueFromThisRow][deleteValueFromThisCol]);
				arr[deleteValueFromThisRow][deleteValueFromThisCol] = Integer.MIN_VALUE;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println();
				System.out.println("Cant delete the value as cell# provided is not in the range of array !");
				// e.printStackTrace();
			}		
		}
		
		// Delete the entire Array
		public void deleteThisArray() {
				arr = null;
				System.out.println("Array has been succefully deleted");
		}
}
