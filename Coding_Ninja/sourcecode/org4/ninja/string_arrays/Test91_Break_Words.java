package org4.ninja.string_arrays;

/*
 * // Time Complexiy of this code is O(n*n)....
// This is a shift function to shift the string and insert" " at starting..
 */
/**
 * Problem statement
You are given a sentence contained in given string S. 
Write a function which will replace all the words within the sentence whose length 
is even and greater than equal to 4, with a space between the two equal halves of the word.

Space complexity should be O(1).

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= Length of S <= 10000

Sample Input :
Helloo world good morniing
Sample Output :
Hel loo world go od morn iing
 * 
 *
 */
public class Test91_Break_Words {
/*
 * void shift(char* ptr)
{
ptr[strlen(ptr)+1]='\0';
for(int i=strlen(ptr);i>0;i--)
{
ptr[i]=ptr[i-1];
}
*ptr=' ';
}
// This is the function which splits the even length string with length>=4 in two equal half...
void breakWords(char* S)
{
for(int i=0;S[i]!='\0';i++)
{
int j=0;
if(i>0 && S[i-1]==' ')
{
j=i;
}
while(S[j]!=' ' && S[j]!='\0')
{
j++;
}
if((j-i)%2==0 && j-i>=4)
{
char* ptr=S;
shift(ptr+(i+j)/2);
i=j+1;
}
else if((j-i)%2!=0 || j-i<4)
{
i=j;
}
}
 */
}
