package org.codingpractice.sorting;

//sorting array using selection sort

public class TestSelectionSort {

	
	    
	static void selectionSort(int[] arr) {
		
		int length = arr.length; //length of the array
		
		for(int j = 0 ; j < length  ; j++) {
			
			int iMin = j;
			
			for(int i = j +1;i < length; i++) {
				
				if(arr[i] < arr[iMin]) {//find which is the smallest element to right of 'j'
					iMin = i;		
				}	
			}
            
			if(iMin != j) {// if j is not minimum index then swap
				
				//swap
				int temp = arr[j];
				arr[j] = arr[iMin];
				arr[iMin] = temp;
			}		
		}	
	}
	
	 
	private static void printArray(int[] arr) {
		
		for(int i =  0 ;  i < arr.length ;i++) {
			System.out.print(arr[i] +" ");
		}
		
		
	}
	 
	public static void main(String args[]) {
		
		int array[] = {10, 3, 2, 5, 8, 4, 3, 1, 2, 9, 7, 8};
		System.out.println("Before Sorting Array");
		printArray(array);
		
		System.out.println("\nAfter Sorting Using Selection Sort");
		selectionSort(array);
		printArray(array);
		
		
		
		
	}
	
}
