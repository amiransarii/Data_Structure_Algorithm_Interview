package org5.ninja.hashmaps;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test_4_Print_Array_Intersection_Me {
	public static void intersection(int[] arr1, int[] arr2) {
	    Arrays.sort(arr1);
		Arrays.sort(arr2);

		Map<Integer,Integer> map_arr1 = new HashMap<>();
		Map<Integer,Integer> map_arr2 = new HashMap<>();

		for(Integer item: arr1){
			if(map_arr1.containsKey(item))
				map_arr1.put(item, map_arr1.get(item)+1);
			else
				map_arr1.put(item, 1);
		}

		for(Integer item: arr2){
			if(map_arr2.containsKey(item))
				map_arr2.put(item, map_arr2.get(item)+1);
			else
				map_arr2.put(item, 1);
		}

		
        
		for(Integer item: arr2){
			if (map_arr1.containsKey(item)){
				int val = Math.min(map_arr1.get(item),map_arr2.get(item));

				while (val != 0){
					System.out.print(item +" ");
					val --;
				}
				map_arr1.put(item, 0);
				

			}
			
		}
		System.out.print("\n");
}
}
