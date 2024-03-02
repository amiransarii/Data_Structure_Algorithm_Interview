package org5.ninja.hashmaps;
import java.util.*;
/**
 * Problem statement
Given an integer array of size N, determine whether 4 elements exist such that a+b = c+d. Return true or false accordingly.
Perform this in O(n^2).
Note : (a+b) and (c+d) is unique. For eg, array(10, 10, 8, 9) Pair(10(at index 0),8) and Pair(10(at index 1),8)
 are different pairs but Pair(10(index 0),10(index 1)) and Pair(10(index 1),10(index0)) are same.
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1<= N <=10^3

Sample Input 1:
6
9 8 17 20 30 40
Sample Output 1:
false


Sample Input 2:
6
9 8 7 10 20 30
Sample Output 2:
true
Sample Output 2 Explanation :
9+8 = 10+7
Hence 4 elements exist which satisfy this relation.


Sample Input 3:
6
100 250 3 3 600
Sample Output 3:
true
Sample Output 3 Explanation :
100+3 (3 at index 1) = 100+3 (3 at index 2)
 * 
 *
 */
public class Test_93_Equal_Sum_Pairs {
	public static boolean findPairs(int[] arr){
        Map<Integer, Boolean> map = new HashMap<Integer,Boolean>();
        
        int n = arr.length;

        for(int i = 0; i < n; i++){
          for(int j = i+1; j < n; j++){
                  int sum_i_j = arr[i]+arr[j];
                  if(map.containsKey(sum_i_j)){
                          return true;
                  }
            map.put(sum_i_j,true);
          }
        }
        return false;
	}
}
