package org5.ninja.hashmaps;

/*
 * Problem statement
You are given with an array (of size N) consisting 
of positive and negative integers that contain numbers in random order.
Write a program to return true if there exists a sub-array whose sum is zero else, return false.

Sample Input 1 :
6 
7 1 3 -4 5 1
Sample Output 1 :
true
Sample Input 2 :
5 
-6 7 6 2 1
Sample Output 2 :

 */
public class Test_8_Zero_Sum_Sub_Array {
/*
 * #include<unordered_map>
bool subArrayZeroSum(int input[], int n)
{
//create hashmap to store sum of array elements from index 0 to i
unordered_map<int, bool> m;
int sum = 0;
for(int i = 0 ; i < n ; i++)
{
sum += input[i];
// If sum becomes 0 or if this sum is already present in hashmap, then there exists a
sub-array with zero sum
if(sum == 0 || m.count(sum)!=0)
{
return true;
}
//Adding present sum to hashmap
m[sum] = 1;
}
//If no sub-array has zero sum, then return false
return false;
}
 * 
 * 
 * 
 * 
 * 
 * 
 */
}
