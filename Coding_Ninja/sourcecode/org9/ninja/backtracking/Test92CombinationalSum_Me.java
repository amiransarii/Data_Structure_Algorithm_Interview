package org9.ninja.backtracking;
import java.util.*;
public class Test92CombinationalSum_Me {
	public static ArrayList<ArrayList<Integer>> combinationSum(int[] arr, int sum) {
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		 Integer[] what = Arrays.stream( arr ).boxed().toArray( Integer[]::new );
		 
		 List<Integer>A = Arrays.asList(what);
		    findCombination(0, sum,
		        A.stream().mapToInt(Integer::intValue).distinct().sorted().toArray(),
		        ans, new ArrayList<>());
		    return ans;
	}

    static void findCombination(int idx, int target, 
			int[] arr, ArrayList<ArrayList<Integer>> ans, List<Integer> ds){
        //base case
       
        if(idx == arr.length){
            if(target == 0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        //recursion
        if(arr[idx] <= target){
            ds.add(arr[idx]);
            findCombination(idx,target-arr[idx],arr,ans,ds); //function call
            ds.remove(ds.size()-1); //backtracking step
        }
        findCombination(idx+1,target,arr,ans,ds);
    }
}
