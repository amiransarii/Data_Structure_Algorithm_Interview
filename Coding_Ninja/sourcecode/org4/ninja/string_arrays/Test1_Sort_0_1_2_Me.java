package org4.ninja.string_arrays;

public class Test1_Sort_0_1_2_Me {
public static void sort012(int[] arr){
    	
        int idx = 0;
        int low = 0;
        int high = arr.length -1;

        while (idx <= high){
            
            if(arr[idx] == 0){
                int temp = arr[idx];
                arr[idx] = arr[low];
                arr[low] = temp;
                idx ++;
                low ++;
            }
            else if (arr[idx] == 1){
                idx ++;
            }

            else{
                 int temp = arr[idx];
                arr[idx] = arr[high];
                arr[high] = temp;

                high --;
            }


        }
    }
}
