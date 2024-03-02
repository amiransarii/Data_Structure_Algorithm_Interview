package org5.ninja.hashmaps;

import java.util.*;

public class Test_7_Pairs_With_Difference_K_Me {
	public static int getPairsWithDifferenceK(int arr[], int k) {

		Map<Integer, Integer> map_pairs = new HashMap<Integer, Integer>();
		int n = arr.length;
		for (int i = 0; i < n; i++)
			if (map_pairs.containsKey(arr[i]))
				map_pairs.put(arr[i], map_pairs.get(arr[i]) + 1);
			else
				map_pairs.put(arr[i], 1);

		int count = 0;
		for (Integer item : arr) {
			if (k == 0) {
				int fre = map_pairs.get(item);
				count = (fre * (fre - 1)) / 2;
				break;
			} else {
				int target = item + k;
				if (map_pairs.containsKey(target)) {
					count += map_pairs.get(target);
				}
			}
		}
		return count;
	}
}
