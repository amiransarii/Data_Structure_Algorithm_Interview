package org8.ninja.oops;

import java.util.Scanner;

import org.nininja.utils.Student4;



public class Test4ThisFinalKeywords {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
		
		Student4 s1 = new Student4("Ankush", 123);
		//System.out.println(s1);
//		System.out.println(s1.name);
//		System.out.println(s1.getRollNumber());
		s1.print();
		
		Student4 s2 = new Student4("Manisha", 121);
		//System.out.println(s2);
		s2.print();
		
//		System.out.println(s1.numStudents);
//		System.out.println(s2.numStudents);
		System.out.println(Student4.getNumStudents());
		//System.out.println(s1.getNumStudents());
		
		System.out.println(s1.name);
		
//		System.out.println(s1.name);
//		System.out.println(s2.name);
//		System.out.println(s1.getRollNumber());
//		//System.out.println(s1);
	}
}
