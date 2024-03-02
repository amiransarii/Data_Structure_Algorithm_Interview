package org5.ninja.hashmaps;
import java.util.HashSet;
import java.util.Set;

public class Test_8_Zero_Sum_Sub_Array_Me {
	public static boolean subarraySumTo0(int[] input) {
		Set<Integer> mset = new HashSet<Integer>();
		int sum = 0;

		for (Integer item: input){

			sum += item;
			if(item == 0 || sum == 0 || mset.contains(sum))
				return true;
			mset.add(sum);
		}
	    return false;

			
		}
}
