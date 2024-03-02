package org.nininja.utils;

public class Car4 extends Vehicle4 {
	public int numGears;
	boolean isConvertible;
	
	public void print() {
		super.print();
		System.out.println("Car numGears : " + numGears);
		System.out.println("Car isConvertible : " + isConvertible);
	}
}
