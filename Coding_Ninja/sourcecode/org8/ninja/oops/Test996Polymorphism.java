package org8.ninja.oops;

import java.util.Scanner;

import org.nininja.utils.Car6;
import org.nininja.utils.Vehicle6;

public class Test996Polymorphism {
	public static void main(String[] args) {
//		Vehicle v = new Vehicle();
//		v.color = "Black";
//		v.setMaxSpeed(10);
//		v.print();
		
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		
		Vehicle6 v;
		if(n == 0) {
			v = new Car6(10, 20);
		}
		else {
			v = new Vehicle6(20);
		}
		//v.isConvertible();  -- not working
		//v.isConvertible();
		v.print();
		
//		Car c = new Car(10, 20); 
//		c.color = "Black";
//		c.setMaxSpeed(100);
//		c.print();
	}
}
