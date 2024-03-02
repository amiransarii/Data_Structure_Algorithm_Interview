package org91.ninja.dynamicprogrmming;
import java.util.Arrays;
import java.util.Scanner;
public class Test5AlphaCode_Me {
	public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	        while (true) {
	            String s = sc.next();
	            if (s.equals("0"))
	                break;
	            int[] input = new int[s.length()];
	            for (int i = 0; i < s.length(); i++) {
	                input[i] = s.charAt(i) - '0';
	            }
	            int result = noOfDecoding(input, s.length());
	            System.out.println(result);
	        }
	        sc.close();
			
			
		}

		public static int noOfDecoding(int[] input, int size){
			 int[] dp = new int[size + 1];
	        dp[0] = 1;
	        dp[1] = 1;

	        for (int i = 2; i <= size; i++) {
	            if (input[i - 1] != 0) {
	                dp[i] = dp[i - 1];
	            }
	            int twoDigits = input[i - 2] * 10 + input[i - 1];
	            if (twoDigits >= 10 && twoDigits <= 26) {
	                dp[i] = (dp[i] + dp[i - 2]) % 1000000007;
	            }
	        }
	        return dp[size];
		}
}
