package org5.ninja.hashmaps;
import java.util.*;

/*
 * Sample Input 2 :
7
3 7 2 1 9 8 41
Sample Output 2 :
7 9
Explanation:There are two sequences of equal length here: [1,2,3] and [7,8,9]. 
But since [7,8,9] appears first in the array (7 comes before 1), 
we return this sequence. So the output is [7,9].
 */
public class Test_6_Longest_Consecutive_Sequences_me {
public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
		
		Map<Integer,Boolean> map = new HashMap<Integer,Boolean>();
	   ArrayList<Integer> seq_list = new ArrayList<Integer>();

	   int n = arr.length;
		for(int i = 0; i <n; i++ )
			map.put(arr[i],true);
		
	  int max = Integer.MIN_VALUE;
	   int start = 0;
	   int end = 0;
	   
		for (int i = 0; i < n; i++){
			int val = arr[i];
            /*
             * we need to identify starting point of such sequence. 
             * so if current value 'val' does not have a predecessor (val-1) in array, 
             * it will assign start=val as it says val is start of new consecutive sequence
             */
			
			/*
			 * above if(!map.containsKey(val-1)) 
			 * check is executing regardless of whether condition is true or false. 
			 * Also logic also handles the case when val is notstart of new sequence too,  
			 * the logic is part of outer loop. so here no need of else condition.
			 */
			if(!map.containsKey(val-1)){
				int  current_val = val;
				int current_length = 0;

				while (map.containsKey(current_val)){
					current_val++;
					current_length++;
				}
				if (current_length >max){
					start=val;
					end=current_val-1; //adjust for inclusive range of elements in consecutive sequence
					max = current_length;
				}
		}
	}
            seq_list.add(start);
			seq_list.add(end);
			return seq_list;
	}
}
