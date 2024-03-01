package org.codingpractice.recursive;

public class TestFibonacciSeries {
	static int f1=0,f2=1,f3=0;      
	
	static void findFiboSeries(int count) {
		
		if(count >0) {
			 
			f3 = f2 + f1;
			f1 = f2;
			f2 = f3;
			
			System.out.print(f3 +" ");
			findFiboSeries(count - 1);
		}
	}
	
	public static void main(String args[]) {
		int count = 13;
		System.out.print( f1 +" " + f2 +" ");
		findFiboSeries(count);
		
		
	}
	
	

}
