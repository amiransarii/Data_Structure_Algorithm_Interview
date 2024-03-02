package org7.ninja.recursion2;

public class Test8MinimumCount_Me {
public static int minCount(int n){
		
		if( n <= 0){
			return 0;
		}
		else if ( n == 1){
			return 1;
		}

		else{
              int ans = 0;

			for (int i = 1; i <=n ; i++){
				if (i*i > n){
                 break;
				}
				 ans = minCount(n -i*i);
			}
          
		  return 1 +ans;

		}

		
			
			
		
		
	}
}
