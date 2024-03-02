package org8.ninja.oops;

import org.nininja.utils.Car4;
import org.nininja.utils.Vehicle4;

public class Test994Super {
	public static void main(String[] args) {
		Vehicle4 v = new Vehicle4();
		v.color = "Black";
		v.setMaxSpeed(10);
		v.print();
		
		Car4 c = new Car4();
		c.numGears = 10;
		c.color = "Black";
		c.setMaxSpeed(100);
		c.print();
	}
}
