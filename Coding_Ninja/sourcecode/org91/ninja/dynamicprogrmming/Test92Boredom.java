package org91.ninja.dynamicprogrmming;

/*
 * Gary is bored and wants to play an interesting but tough game . 
 * So he figured out a new board game called "destroy the neighbours" .
 *  In this game there are N integers on a board. 
 * In one move, he can pick any integer x from the board and 
 * then all the integers with value x+1 or x-1 gets destroyed .This move will give him x points.

He plays the game until the board becomes empty . But as he want 
show this game to his friend Steven, he wants to learn techniques 
to maximise the points to show off . Can you help Gary in 
finding out the maximum points he receive grab from the game ?
Note: The element to be picked is also removed from the list.
Constraints :
1<=N<=10^5

1<=A[i]<=1000

Sample Input :
2
1 2
Sample Output :
2
 */
public class Test92Boredom {
	public static int []freq=new int[1002],dp=new int[1002];
	public int max(int a,int b)
	{
	if(a<b)
	return b;
	return a;
	}
	public int solve(int n,int A[])
	{
	for(int i=0;i<n;i++)
	{
	freq[A[i]]++; //count the frequency of each integer
	}
	dp[1]=freq[1]; //Dp[i] denotes the max points when i is the highest integer to be removed
	for(int i=2;i<=1000;i++)
	{
	dp[i]=max(dp[i-1],dp[i-2]+i*freq[i]);
	}
	return dp[1000];
	}
}
