package org5.ninja.hashmaps;
import java.util.HashMap;

/*
 * Problem statement
 * You are given with an array of integers and an integer K. 
 * You have to find and print the count of all such pairs which have difference K.
 * 
 Note: Take absolute difference between the elements of the array.
 Detailed explanation ( Input/output format, Notes, Images )
 */

/*
 * Time complexity: O(N)
 * Space complexity: O(N)
 *
 * where N is the size of the input array
 */

/*
 * Sample Input 1 :
 * 4 
 * 5 1 2 4
 * 3
 * Sample Output 1 :
 * 2
 * Explanation
 * (5,2) and (1,4) are the possible combinations as their absolute difference is 3.
 */

public class Test_7_Pairs_With_Difference_K {
	public static int getPairsWithDifferenceK(int arr[], int k) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int pairCount = 0;
		for (int i : arr) {
			int p1 = i + k;
			boolean flag = false;
			if (i == p1) {
				flag = true;
			}
			if (map.containsKey(p1)) {
				pairCount += map.get(p1);
			}
			int p2 = i - k;
			if (map.containsKey(p2) && !flag) {
				pairCount += map.get(p2);
			}
			if (map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			} else {
				map.put(i, 1);
			}
		}
		return pairCount;
	}
}
