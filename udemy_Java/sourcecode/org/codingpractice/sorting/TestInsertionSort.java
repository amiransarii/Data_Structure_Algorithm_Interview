package org.codingpractice.sorting;

import java.util.Arrays;

//implementation of insertion sort
public class TestInsertionSort {
	
	static void insertationSort(int arr[]) {
		
		int length = arr.length; // array length
		
		for(int i = 1 ; i < arr.length; i++) {
			
			int temp = arr[i];
			int j = i;
			
			while(j > 0 && arr[j - 1] > temp) {
				arr[j] = arr[j - 1]; // swap
				j--;
			}
			arr[j] = temp;
		}		
	}
	
	private static void printArray(int[] arr) {
		
		Arrays.stream(arr).forEach(item->{
			System.out.print(item +" ");
		});
		
	}
	
	
	public static void main(String args[]) {
		
		int array[] = {10, 3, 2, 5, 8, 4, 3, 1, 2, 9, 7, 8};
		System.out.println("Before Sorting");
		
		printArray(array);
		System.out.println("\n After Sorting");
		insertationSort(array);
		printArray(array);
		
		
		
		
	}

}
