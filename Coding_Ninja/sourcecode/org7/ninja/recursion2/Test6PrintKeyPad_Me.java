package org7.ninja.recursion2;

public class Test6PrintKeyPad_Me {
	public static void printKeypad(int input){
		 printKeypad(input,"");
		
	}

	public static void printKeypad(int num,String output){
		if(num == 0){
			System.out.println(output);
			return;
		}

		String s[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
     
	   String input_chars=s[num%10];
	   for(int i=0;i<input_chars.length();i++){
      printKeypad(num/10,input_chars.charAt(i)+output);
  }

	}
}
