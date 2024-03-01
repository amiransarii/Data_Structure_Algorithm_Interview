package org.codingpractice.recursive;

//find min and max number in array using recursive
public class TestFindMinMaxNumber {
	
	static int min = Integer.MAX_VALUE;
	static int max = Integer.MIN_VALUE;
	
	static int findMinMaxNumber(int arr[], int n,boolean isMax) {
		 
	//base case only one number
  	if(n >= 0) {
			
			//base case if only one number
			if(n == 0)
				return arr[0];
			
			else if (arr[n - 1] > max) {
				max = arr[n - 1];
			}
			
			else if(arr[n -1] < min) {
				min = arr[ n - 1];
			}
			
			findMinMaxNumber(arr, n - 1,isMax);
		}	
	
  	     if(isMax)
		 return max;
  	     
  	     return min;
		
		
	}
	
	public static void main(String arg[]) {
		int[] arr = {10,500,1,30000,400,50,2};
		
		int max = findMinMaxNumber(arr, 7,true);
		System.out.println("Max Number "+max);
		
		int min = findMinMaxNumber(arr, 7, false);
		System.out.println("Find Minimum Number "+min);
		
	}
	
	

}
