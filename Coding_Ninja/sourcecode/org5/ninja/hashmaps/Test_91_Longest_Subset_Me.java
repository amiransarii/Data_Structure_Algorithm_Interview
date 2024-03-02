package org5.ninja.hashmaps;
import java.util.*;

public class Test_91_Longest_Subset_Me {
	public static int max(int[] arr) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		int n = arr.length;
		int zero_frq = 0;
		int one_frq = 0;
		int max_len = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			int curr_val = arr[i];

			if (curr_val == 0)
				zero_frq++;

			if (curr_val == 1)
				one_frq++;

			int diff = zero_frq - one_frq; 
			//if count is difference is found in map, it means that same count was encountered earlier in array
			if (map.containsKey(diff)) {//zero_frq-one_frq) will check current count  difference  which has been encountered before.
				int length = i - map.get(diff);
				max_len = Math.max(max_len, length);
			} else {
				map.put(diff, i);////add (zero_freq-one_freq) as a key to the map with value i (current index)
			}

		}
		return max_len;
	}
}
