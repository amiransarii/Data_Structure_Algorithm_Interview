package org.codingpractice.recursive;

public class TestArrayIsSorted {
	/**
	 * 1: If size of array is zero or one, return true.
     2: Check last two elements of array, if they are
       sorted, perform a recursive call with n-1
       else, return false.
       If all the elements will be found sorted, n will
        eventually fall to one, satisfying Step 1.
	 */
	 // main function 
    public static void main(String[] args) 
    { 
        int arr[] = { 20, 23, 23, 45, 78, 88 }; 
        int n = arr.length; 
        if (isArraySortedOrNot(arr, n)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 
	
	
	 
	
	private static boolean isArraySortedOrNot(int[] arr, int n) {
		
		// Array has one or no element or the 
        // rest are already checked and approved. 
		 
		if(n == 1 || n == 0)
			return true;
		
		// Unsorted pair found (Equal values allowed) 
		 if(arr[n -1] < arr[n -2])
			 return false;
		 
		 // Last pair was sorted 
	       // Keep on checking 
		return isArraySortedOrNot(arr, n -1);
		
		
	}
}
