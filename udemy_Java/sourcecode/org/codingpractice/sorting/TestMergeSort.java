package org.codingpractice.sorting;import javax.sound.midi.MidiChannel;

//sorting using merge
public class TestMergeSort {

	
	private static void mergeSort(int[] arr, int left, int right) {
		 if(right > left) {
			 
			 int m = (left + right) /2;
			 mergeSort(arr,left,m);
			 mergeSort(arr, m+1, right);
			 mergeArray(arr, left, m, right);	 
		 }
		}

	private static void mergeArray(int[] arr, int left, int mid, int right) {
		// TODO Auto-generated method stub
		
		int leftTmpSize = mid -left +2;
		int rightTmpSize = right -mid +1  ;
		
		int[] leftTempArr = new int[leftTmpSize];
		int[] rightTempArr = new int[rightTmpSize];
		
		//copy data to temp arrays
		for(int i = 0;i <= mid -left; i++) {
			leftTempArr[i]= arr[left+i];
		}
		
		for(int j = 0 ; j <right-mid;j++ ) {
			rightTempArr[j]= arr[mid+1+j];
		}
		
		//Merge values and insert into Array 'arr
		 int i =0; //left
		 int j = 0;//right
		 leftTempArr[mid-left+1]= Integer.MAX_VALUE; //Merge values and insert into Array 'A'
		 rightTempArr[right-mid] = Integer.MAX_VALUE;
		 
		for(int k = left; k <= right; k++) {
			
			if(leftTempArr[i] < rightTempArr[j]) {
				arr[k] = leftTempArr[i];
				i++;
			}
			else {
				arr[k] = rightTempArr[j];
				j++;
			}
		}		
	}
	
	public static void printArray(int []array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+"  ");
		}
	}//end of method
	
	
	public static void main(String args[]) {
		int array[] = {10, 3, 2, 5, 8, 4, 3, 1, 2, 9, 7, 8};
		System.out.println("Before  Sorting");
		printArray(array);
		
		System.out.println("\n After Sorting");
		mergeSort(array,0,array.length - 1);
		printArray(array);
		
		
	}
}
