package org91.ninja.dynamicprogrmming;

public class Test7NoOfBST_Me {
	public static long balancedBTs(long n){
		if (n <= 1) {
			return 1;
			}
		
		int mod =(int) Math.pow(10, 9) + 7;
		long x = balancedBTs(n - 1);
		long y = balancedBTs(n - 2);
		long temp1 = (x * x) % mod; // Number of BTs made by attaching subtrees of height (n - 1) at both sides of root
		long temp2 = (2 * x * y) % mod; // Number of BTs made by attaching subtrees of heights (n - 1) and (n - 2) at each side of root
		long ans = (temp1 + temp2) % mod;
		return ans;
}
}
