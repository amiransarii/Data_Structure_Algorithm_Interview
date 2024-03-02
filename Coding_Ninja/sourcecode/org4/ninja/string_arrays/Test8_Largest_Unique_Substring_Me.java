package org4.ninja.string_arrays;

public class Test8_Largest_Unique_Substring_Me {
	public static String findLargestUniqueSubstring(String str){
		int n = str.length();
        int res = 0;
		String retStr = "";
 
        for (int i = 0; i < n; i++)
            for (int j = i; j < n; j++)
                if (areDistinct(str, i, j)){
					int startIdx = i;
					int endIdx = j;

					if((endIdx-startIdx) > res){
						retStr = str.substring(i,j+1);
						res = endIdx-startIdx;
					}

				}
          return retStr;         
				    
	}

	public static Boolean areDistinct(String str, int i,int j)
    {
        boolean[] visited = new boolean[256];
 
        for (int k = i; k <= j; k++) {
            if (visited[str.charAt(k)] == true)
                return false;
 
            visited[str.charAt(k)] = true;
        }
        return true;
    }
}
