package org6.ninja.recursion1;

public class Test91_Print_Number {
	public static void print(int n){
	    if(n < 0){
	        return;
	    }
	    System.out.print(n+" ");
	    print(n - 2);
	    }

	    public static void main(String[] args) {
	    int num = 5;
	    print(num);
	    }
}
