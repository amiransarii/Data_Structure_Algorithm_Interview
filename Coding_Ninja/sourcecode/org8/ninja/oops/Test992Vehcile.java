package org8.ninja.oops;

import org.nininja.utils.Car2;
import org.nininja.utils.Vehicle2;

public class Test992Vehcile {
	public static void main(String[] args) {
		Vehicle2 v = new Vehicle2();
		v.color = "Black";
		v.setMaxSpeed(10);
		v.print();
		
		Car2 c = new Car2();
		c.numGears = 10;
		c.color = "Black";
		c.setMaxSpeed(100);
		c.print();
	}
}
