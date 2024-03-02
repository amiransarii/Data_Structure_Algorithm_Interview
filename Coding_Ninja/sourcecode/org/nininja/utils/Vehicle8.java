package org.nininja.utils;

public abstract class Vehicle8 {
	protected String color;
	private int maxSpeed;
	
	public Vehicle8(int maxSpeed) {
		this.maxSpeed = maxSpeed;
		System.out.println("Vehicle Constructor");
	}
	
//	public Vehicle() {
//		System.out.println("Vehicle Constructor");
//	}
	
	public abstract boolean isMotorized();
	
	public abstract String getCompany();
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public void print() {
		System.out.println("Vehicle Color : " + color);
		System.out.println("Vehicle Speed : " + maxSpeed);
	}
}
