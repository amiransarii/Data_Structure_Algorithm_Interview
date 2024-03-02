package org5.ninja.hashmaps;
import java.util.*;

public class Test_92_Nearest_Repetition_Me {
	
public static int minDistance(int[] arr){
        
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        Map<Integer,Integer> map_dis = new HashMap<Integer,Integer>();
         
         int min =  Integer.MAX_VALUE;
        for (int idx = 0; idx < n; idx++){
            int val = arr[idx];
            if(map.containsKey(val)){
                int distance = Math.abs(idx - map.get(val));
                min = Math.min(min, distance);
            }
                map.put(val, idx);
            
        }
        return min;
	}

}
