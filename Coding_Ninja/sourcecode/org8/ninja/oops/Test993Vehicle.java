package org8.ninja.oops;

import org.nininja.utils.Car3;
import org.nininja.utils.Vehicle3;

public class Test993Vehicle {
	public static void main(String[] args) {
		Vehicle3 v = new Vehicle3();
		v.color = "Black";
		v.setMaxSpeed(10);
		v.print();
		
		Car3 c = new Car3();
		c.numGears = 10;
		c.color = "Black";
		c.setMaxSpeed(100);
		c.print();
	}
}
