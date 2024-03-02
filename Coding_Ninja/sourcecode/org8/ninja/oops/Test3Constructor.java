package org8.ninja.oops;

import java.util.Scanner;

import org.nininja.utils.Student3;

public class Test3Constructor {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Student3 s1 = new Student3("Ankush", 123);
		//System.out.println(s1);
//		System.out.println(s1.name);
//		System.out.println(s1.getRollNumber());
		s1.print();
		
		Student3 s2 = new Student3("Manisha", 121);
		//System.out.println(s2);
		s2.print();
//		System.out.println(s1.name);
//		System.out.println(s2.name);
//		System.out.println(s1.getRollNumber());
//		//System.out.println(s1);
	}

}
