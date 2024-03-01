package org.codingpractice.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

/**
 * 
  task is to sort them in such a way that the first part of the array contains odd 
  numbers sorted in descending order,rest portion contains even numbers sorted in ascending order
 */

public class TestSortArrayOddAndEven {
	
	//intialize two array even and odd
	private static int[] oddArr;
	private static int[] evenArr;
	
	public static void main(String args[]) {
		
		int[] arr = {1, 2, 3, 5 ,4 ,7, 10};
		int n = arr.length;
		
		oddArr = new int[n];
		evenArr = new int[n];
		
		//initialize odd and even array
		
		for(int i = 0 ; i < arr.length;i++) {
			
			oddArr[i] = Integer.MIN_VALUE;
			evenArr[i] = Integer.MIN_VALUE;		
		}
		
		sortEvenAndOddNumbers(arr);
	}
	       
	static void sortEvenAndOddNumbers(int[] arr) {
		
		for(int i = 0; i< arr.length;i++) {
			
			if(arr[i] %2 ==0) { //even number
				evenArr[i] = arr[i]; //add element in even array
			}
			else {
				oddArr[i] = arr[i]; //add element in odd array
			}
			}
		
		 sortAscDesc(oddArr);
		 Arrays.sort(evenArr);
		 //sortAscDesc(evenArr, true);
		 
		 for(int i =0 ; i < oddArr.length;i++) { //iterate odd value
			 if(oddArr[i] != Integer.MIN_VALUE) {
				 System.out.print(oddArr[i]);
			 }
		 }
		 
		 for(int j = 0 ; j <evenArr.length ;j++) { //iterate even value
			  if(evenArr[j] != Integer.MIN_VALUE) {
				  System.out.print(evenArr[j]);
			  }
		 }
		
		
		 //IntStream joinedStream = IntStream.concat(Arrays.stream(oddArr), Arrays.stream(evenArr));
        //return joinedStream.toArray();
		
		 }
	
	
	
	    
	       
	//sort array ascending and descending order
	 private static void sortAscDesc(int[] arr) {
		  
		 //isAsc  true sort based on Ascending order
		 //!isAsc sort based on ascending order
		 //bubble sort sorting
		 
		 for(int i = 0 ; i < arr.length; i++) { 
			 
			 for(int j = 0 ; j < arr.length -i-1; j++) {
				 					 
					 if(arr[j] < arr[j +1] ) {
						 
						 int temp = arr[j +1];
						 arr[j +1] = arr[j];
						 arr[j] = temp;
					 }
					 
						 
			 }
			 
			 
		 }
		 
		 
		 
	 }
	
	

}
