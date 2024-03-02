package org8.ninja.oops;
import java.util.Scanner;

import org.nininja.utils.Student2;


public class Test2AccessModifier {
	Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Student2 s1 = new Student2();
		//s1.name = "Ankush";
		s1.setRollnumber(-123);
		
		Student2 s2 = new Student2();
		//s2.name = "Manisha";
		s2.setRollnumber(121);
		
		//System.out.println(s1.name);
		//System.out.println(s2.name);
		System.out.println(s1.getRollNumber());
//		//System.out.println(s1);
	}

}
