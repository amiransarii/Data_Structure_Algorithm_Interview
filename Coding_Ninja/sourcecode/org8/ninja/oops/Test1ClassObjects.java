package org8.ninja.oops;

import java.util.Scanner;

import org.nininja.utils.Student;

public class Test1ClassObjects {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		Student s1 = new Student();
		s1.name = "Amir";
		s1.roollNumber = 1005015;
		
		Student s2 = new Student();
		s2.name = "Maaz";
		s2.roollNumber = 1005016;
		
		System.out.println(s1.name);
		System.out.println(s2.name);
		System.out.println(s1);
		
	}

}
