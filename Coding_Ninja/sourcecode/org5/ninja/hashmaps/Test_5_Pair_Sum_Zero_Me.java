package org5.ninja.hashmaps;
import java.util.*;

public class Test_5_Pair_Sum_Zero_Me {
	public static int PairSum(int[] input, int size) {
		Map<Integer,Integer> m = new HashMap<>();
         int count = 0;
		 int k = 0;

		for(Integer item: input){

			 if (m.containsKey(k - item)) {
                count += m.get(k - item);
            }
            if (m.containsKey(item)) {
                m.put(item, m.get(item) + 1);
            }
            else {
                m.put(item, 1);
            }
		
	}
	return count;
}
}
