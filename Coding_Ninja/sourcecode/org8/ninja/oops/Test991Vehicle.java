package org8.ninja.oops;

import org.nininja.utils.Car;
import org.nininja.utils.Vehicle;

public class Test991Vehicle {
	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.print();
		
		Car c = new Car();
		c.numGears = 10;
		c.color = "Black";
		c.print();
	}
}
