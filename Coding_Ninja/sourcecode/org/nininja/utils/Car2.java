package org.nininja.utils;

public class Car2 extends Vehicle2 {
	public int numGears;
	boolean isConvertible;
	
	public void print() {
		System.out.println("Car color : " + color);
		System.out.println("Car Speed : " + getMaxSpeed());
		System.out.println("Car numGears : " + numGears);
		System.out.println("Car isConvertible : " + isConvertible);
	}
}
