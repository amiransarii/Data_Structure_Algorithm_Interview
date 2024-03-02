package org8.ninja.oops;

import org.nininja.utils.Car5;

public class Test995InheritanceConstructor {
	public static void main(String[] args) {
//		Vehicle v = new Vehicle();
//		v.color = "Black";
//		v.setMaxSpeed(10);
//		v.print();
		
		Car5 c = new Car5(10, 20);
		c.numGears = 10;
		c.color = "Black";
		c.setMaxSpeed(100);
//		c.print();
	}
}
