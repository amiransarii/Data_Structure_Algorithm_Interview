package org4.ninja.string_arrays;

public class Test4_Leaders_Array_Me {
	public static void leaders(int[] input) {
		int n = input.length;

		 for (int i = 0; i < n; i++)
	        {
	            for (int j = i; j < n; j++)
	            {
	                if (input[i] < input[j])
	                {
	                    break;
	                }
		
	                if (j == n - 1)
	                    System.out.print(input[i]+" ");
	            }
	        }
			
		}
		
}
