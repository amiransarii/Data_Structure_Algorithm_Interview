package org9.ninja.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Test90LexicographicalOrder {
	public static void lexicographicalOrder(int num){
		lexNumbers(num);
	}

public static void lexNumbers(int n)
    {
        List<Integer> sol = new ArrayList<>();
        dfs(1, n, sol);
        
		for (Integer r: sol){
			System.out.println(r);
		}
    }
 
    public static void dfs(int temp, int n,
                           List<Integer> sol)
    {
        if (temp > n)
            return;
        sol.add(temp);
        dfs(temp * 10, n, sol);
        if (temp % 10 != 9)
            dfs(temp + 1, n, sol);
    }
}
