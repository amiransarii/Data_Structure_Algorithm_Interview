package org6.ninja.recursion1;

public class Test99_Sum_Of_Digits_Me {
public static int sumOfDigits(int input){
		
		if(input <=9){
			return input;
		}

		int digit = input % 10;
		return digit + sumOfDigits(input/10);
	
	}
}
