package org7.ninja.recursion2;
/*
 * Problem statement
Given an integer N, find and return the count of minimum numbers, sum of whose squares is equal to N.

That is, if N is 4, then we can represent it as : {1^2 + 1^2 + 1^2 + 1^2} and {2^2}. 
Output will be 1, as 1 is the minimum count of numbers required.

Note : x^y represents x raise to the power y.
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= N <= 50

Sample Input 1 :
12
Sample Output 1 :
3
Sample Output 1 Explanation :
12 can be represented as :
1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1
1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 1^1 + 2^2
1^1 + 1^1 + 1^1 + 1^1 + 2^2 + 2^2
2^2 + 2^2 + 2^2
As we can see, the output should be 3.
Sample Input 2 :
9
Sample Output 2 :
1
 */
public class Test8MinimumCount {
	/* Your class should be named Solution
	* Don't write main().
	* Don't read input, it is passed as function argument.
	* Return output and don't print it.
	* Taking input and printing output is handled automatically.
	*/
	public static int minCount(int n){
	if(n <= 1){
	return n;
	}
	int ans = n;
	for(int i = 1; i <= n; i++){
	int square = i * i;
	if(square > n){
	break;
	}
	ans = Math.min(ans, minCount(n - square) + 1);
	}
	return ans;
	}

}
