package org5.ninja.hashmaps;
import java.util.*;

public class Test_3_MaximumFrequncyNumber_Me {
	public static int maxFrequencyNumber(int[] arr){ 
		Map<Integer, Integer> map = new HashMap<>();
		int element = arr[0];
		int max = Integer.MIN_VALUE;

		for(int i = 0; i < arr.length; i++){
			if (map.containsKey(arr[i])){
				map.put(arr[i],map.get(arr[i]) +1);
			}
			else{
				map.put(arr[i], 1);
			}
		}
       
	   Set<Integer> mset = new HashSet<>();
	   mset = map.keySet();
	   for (Integer k: arr){
		   int val = map.get(k);
		   if(val > max){
				element = k;
				max = val ;
			}
	   }
	 
		return element;
    }
}
