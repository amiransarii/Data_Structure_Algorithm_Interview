package org.nininja.utils;

public class Car5 extends Vehicle5 {
	public int numGears;
	boolean isConvertible;
	
	public Car5(int numGears, int maxSpeed) {
		super(maxSpeed);
		this.numGears = numGears;
		System.out.println("Car Constructor");
	}
	
	public void print() {
		super.print();
		System.out.println("Car numGears : " + numGears);
		System.out.println("Car isConvertible : " + isConvertible);
	}
}