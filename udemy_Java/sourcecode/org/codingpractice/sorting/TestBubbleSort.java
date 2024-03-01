package org.codingpractice.sorting;

import java.util.Arrays;

//sorting using bubble sort
public class TestBubbleSort {
	
	static void bubbleSort(int[] arr) {
		
		int length = arr.length; // array length
		
		for(int i = 0 ;  i < length - 1; i++) { //outer loop iterate all the elements of an array
			
			for(int j = 0; j < length - i -1; j++) { //inner loop compare adjacent element and put sorted element at the end
				
				if(arr[j] > arr[j +1]) {
					//swap the element
					int temp = arr[j +1];
					arr[j + 1] = arr[j];
					arr[j] = temp;	
					
					/**
					 * or
					 * int temp = arr[j];
				    	arr[j] = arr[j + 1];
				    	arr[j + 1] = temp;
					 */
				}		
			}
			
		}	
	}
	
	private static void printArray(int [] arr) {
		
		Arrays.stream(arr).forEach(item->{
			System.out.print( item +" ");
		});
		
	}
	
	public static void main(String args[]) {
		
		int arr[] = { 10, 5, 30, 15, 50, 6 };
		System.out.println("Before Sorting Elements");
		printArray(arr);
		
		System.out.println("\n"+"After Sorting Elements Using Bubble Sort");
		bubbleSort(arr);
		printArray(arr);
		
		
	}

}
