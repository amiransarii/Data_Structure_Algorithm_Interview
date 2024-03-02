package org4.ninja.string_arrays;
import java.util.*;
/**
 * Problem statement
Given two arrays (both of size n), one containing arrival time of trains and other 
containing the corresponding trains departure time (in the form of an integer) respectively. 
Return the minimum number of platform required, such that no train waits.

Arrival and departure time of a train can't be same.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= n <= 100

Sample Input 1 :
6
900 940 950 1100 1500 1800
910 1200 1120 1130 1900 2000
Sample Output 1 :
3

Sample Input 2 :
4
1100 1101 1103 1105
1110 1102 1104 1106
Sample Output 2 :
2
 * 
 *
 */
public class Test3_Count_the_Platforms {
	public static int platformsNeeded(int arrival[], int departure[]){
		Arrays.sort(arrival);
		Arrays.sort(departure);
		int i = 0;
		int j = 0;
		int count = 0;
		int max = Integer.MIN_VALUE;
		while(i < arrival.length && j < departure.length) {
		if(arrival[i] < departure[j]) {
		count++;
		i++;
		} else {
		count--;
		j++;
		}
		if(count > max) {
		max = count;
		}
		}
		return max;
		}

}
