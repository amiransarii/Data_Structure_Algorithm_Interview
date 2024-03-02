package org.nininja.utils;

public  abstract class Car8 extends Vehicle8{
	int numGears;
	boolean isConvertible;
	
	public Car8() {
		super(100);
	}
	
	public Car8(int numGears, int maxSpeed) {
		super(maxSpeed);
		this.numGears = numGears;
		System.out.println("Car Constructor");
	}
	
	@Override
	public boolean isMotorized() {
		return false;
	}
	
	public boolean isConvertible() {
		return isConvertible;
	}
	
	public void print() {
		super.print();
		System.out.println("Car numGears : " + numGears);
		System.out.println("Car isConvertible : " + isConvertible);
	}
}
