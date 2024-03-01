package org.codingpractice.recursive;

public class TestFindSpeakers {
	
	 static int getSpeakers(int number) {
		 
		 if(number <= 0) {
			 return 0;
		 }
		 else {
			  if(number %2 == 0)
				  return 2 + getSpeakers( number - 1); //even speaker
			  
			  else {
				  return 1 + getSpeakers(number - 1); //odd speaker
			  }		 
		 } 
	 }
	 
	 public static void main(String args[]) {
		 
		 int speakers = getSpeakers(4);
		 System.out.println("6 Speakers "+speakers);
		 
		 
	 }

}
