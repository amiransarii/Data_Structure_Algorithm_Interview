package org4.ninja.string_arrays;

public class Test2_Push_Zeros_to_end_Me {
	public static void pushZerosAtEnd(int[] arr) {
		int place_zero = 0;
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			if (arr[i] != 0) {
				int temp = arr[place_zero];
				arr[place_zero] = arr[i];
				arr[i] = temp;
				place_zero++;
			}

		}
	}
}
