package org.codingpractice.divideconquer;

public class TestConvertOneStringToAnother {
	
	/**
	 * Explanation
	 * convert s1 into s2 and find minimum no of operation
	 * 
	 * case 1: delete
	 * s1 : t a b l e
	 * s2 : t g b l e
	 * 
	 * if we delete g which is not matching character(2 character)
	 * from s2 and s2 index will be moved to next character and s1 will will be at 2 
	 * F(2,3)
	 * 
	 * case 2: insert
	 * s1 : t a b l e
	 * s2 : t b l e
	 * in case 2 Need to insert 'a; one character in s2 and s1 will go to next character
	 * F(3,2)
	 * 
	 * case 3: replacement
	 * s1 : t a b l e
	 * s2 : t c b l e
	 * 
	 * replace c with a and all will move to next character
	 * F(3,3)
	 * 
	 */
	
	 private int findMinOperationsAux(String s1, String s2, int i1, int i2) {
		   
		 //base case
		 if(i1 == s1.length()) // if we have reached the end of s1, then insert all the remaining characters of s2
			 return s2.length() - i2;
		 
		 if(i2 == s2.length())  // if we have reached the end of s2, then delete all the remaining characters of s1
			 return s1.length() -i1;
		 
		 if(s1.charAt(i1) == s2.charAt(i2)) { // If the strings have a matching character, 
			 //recursively match for the remaining lengths.
			 return findMinOperationsAux(s1, s2, i1 +1, i2 +1);
		 }

		 int c1 = 1 + findMinOperationsAux(s1, s2, i1 +1, i2);// perform deletion
		 int c2 = 1 + findMinOperationsAux(s1, s2, i1, i2 +1 );// perform insertion
		 int c3 = 1 + findMinOperationsAux(s1, s2, i1 +1, i2 +1);// perform replacement
		 
		 return Math.min(c1, Math.min(c2, c3));
		 
	 }
	
	 public int findMinOperations(String s1, String s2) {
			return findMinOperationsAux(s1, s2, 0, 0);
		}//end of method
	
	
	
	 public static void main(String[] args) {
		 TestConvertOneStringToAnother editDisatnce = new TestConvertOneStringToAnother();
			System.out.println(editDisatnce.findMinOperations("table", "tbres"));

		}//end of method
	
	
	
	
	
	
	
	

}
