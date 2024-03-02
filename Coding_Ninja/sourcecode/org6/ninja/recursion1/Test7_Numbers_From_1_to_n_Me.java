package org6.ninja.recursion1;

public class Test7_Numbers_From_1_to_n_Me {
	public static void print(int n){

		if(n == 0)
		return;
		
		print(n-1);
		System.out.print(n + " ");
}
}