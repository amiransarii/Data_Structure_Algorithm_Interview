package org7.ninja.recursion2;
/*
 * Problem statement
A flag can consists of only three different colors of stripes, 
White(W), Blue(B) and Red(R). Given an integer N, 
find and return the number of ways to create such 
flags having N stripes consisting of these three color stripes only with the following constraints -

1. Stripes of the same color cannot be placed next to each other.
2. A blue stripe must always be placed between a white 
and a red or between a red and a white one. Hence blue stripe 
cannot be placed at starting or at ending.
3. Its not necessary to use all three colors.
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= N <= 30

Sample Input 1 :
3
Sample Output 1 :
4
Sample Output 1 Explanation :
Possible flags with 3 stripes are : WRW, WBR, RWR, RBW
Sample Input 2 :
4
Sample Output 2 :
6
Sample Output 2 Explanation :
Possible flags with 4 stripes are : WRWR, WRBW, WBRW, RWRW, RWBR, RBWR
 */
public class Test8Flags {

	/*
	 * long long find_Ways(int N)
{
long long ans = 0;
helper(N,'B','S',ans);
return ans;
}
	 */
	
/*void helper(int N, char prev,char prevprev,long long &ans)
{
if(N == 1 && prevprev == 'S')
{
ans = 2;
return;
}
if(N == 1)
{ans++;
return;
}
if(prevprev == 'S')
{helper(N-1,'W','B',ans);
helper(N-1,'R','B',ans);}
else if(prev == 'B' && prevprev == 'W')
helper(N - 1,'R','B',ans);
else if(prev == 'B' && prevprev == 'R')
helper(N - 1,'W','B',ans);
else if(prev == 'W')
{helper(N-1,'R','W',ans);
helper(N-1,'B','W',ans);}
else if(prev == 'R')
{helper(N-1,'W','R',ans);
helper(N-1,'B','R',ans);}
}

 * 
 * 
 */
}
