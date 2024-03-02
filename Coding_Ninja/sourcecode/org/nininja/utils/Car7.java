package org.nininja.utils;

public class Car7 extends Vehicle7{
	int numGears;
	boolean isConvertible;
	
	public Car7(int numGears, int maxSpeed) {
		super(maxSpeed);
		this.numGears = numGears;
		System.out.println("Car Constructor");
	}
	
	public boolean isConvertible() {
		return isConvertible;
	}
	
	public void printCar() {
		//super.print();
		System.out.println("Car numGears : " + numGears);
		System.out.println("Car isConvertible : " + isConvertible);
	}
}