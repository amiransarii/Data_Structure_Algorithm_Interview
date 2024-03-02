package org6.ninja.recursion1;

public class Test993_Geometric_Sum_Me {
	public static double findGeometricSum(int k){
		if(k==0)
	{
		return 1;
	}
return 1+ 0.5*(findGeometricSum(k-1));
//Mesmerise the beauty of the above recursive Call;    
}
/*
Whats actually happening            
let k=3
first recursive call
1+1/2(findGeometricSum(2))
Second Recursive Call
1+1/2(findGeometricSum(1))
Third Recursive Call
1+1/2(findGeometricSum(0))
Now falling Back of Recursive Calls
Second Recursive Call
1+1/2(1+1/2(1))
first recursive call
1+1/2(1+1/2(1+1/2(1)))
Your Output
1.87500
Expected Output
1.87500
*/
	public static double findGeometricSum1(int k){
		if(k==0)
	{
		return 1;
	}
	double ans= (1/(Math.pow(2, k)))+findGeometricSum(k-1); 
//Time consuming since Math library is called as well as more no. of computations/operations [Division cost].
	return ans;

}
}
