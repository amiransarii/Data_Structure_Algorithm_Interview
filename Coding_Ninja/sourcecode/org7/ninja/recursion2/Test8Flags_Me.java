package org7.ninja.recursion2;

public class Test8Flags_Me {
	public static long find_Ways(int N)
	{
        if(N==1 || N==2) 
		return 2;
		
		return find_Ways(N-1)+find_Ways(N-2);
    
	}
}
