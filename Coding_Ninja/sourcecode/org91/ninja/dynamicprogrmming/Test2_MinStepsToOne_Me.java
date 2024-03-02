package org91.ninja.dynamicprogrmming;

public class Test2_MinStepsToOne_Me {
public static int countMinStepsToOne(int n) {
		
		if( n == 1){
			return 0;
		}

		int op1 =  countMinStepsToOne(n-1);
		int minSteps = op1;
		if(n%3 == 0){
			int op2 = countMinStepsToOne(n/3);
			if(op2 < minSteps){
				minSteps = op2;
			}
		}

		if(n%2 == 0){
			int op3 = countMinStepsToOne(n/2);
			if(op3 < minSteps){
				minSteps = op3;
			}
		}
		return 1 + minSteps;
	}
}
