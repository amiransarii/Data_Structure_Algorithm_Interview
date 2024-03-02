package org4.ninja.string_arrays;

public class Test3_Count_the_Platforms_Me {
	public static int platformsNeeded(int arrival[], int departure[]){
		int n = arrival.length;

		for (int i = 0; i <= n-1; i++){
			for(int j = i +1; j <= n -1; j++){
				if(arrival[i] > arrival[j]){
					int tmp = arrival[i];
					arrival[i] = arrival[j];
					arrival[j] = tmp;

					int tmp2 = departure[i];
					departure[i] = departure[j];
					departure[j] = tmp2;
				}
			}
		}
          int ans = 0;
		  for (int i = 0; i <=n-1;i++){
			  int check = 1;
			  for (int j = 0; j <=i-1; j++){
				  if (departure[j] >= arrival[i])
				   check++;
			  }
			  ans = Math.max(ans, check);
		  }
return ans;


	
	}
}
