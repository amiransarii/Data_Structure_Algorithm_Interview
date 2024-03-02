package org.nininja.utils;

public  class Vehicle7 {
//public final class Vehicle7 {
	protected String color;
	private int maxSpeed;
	
	public Vehicle7(int maxSpeed) {
		this.maxSpeed = maxSpeed;
		//System.out.println("Vehicle Constructor");
	}
	
//	public Vehicle() {
//		System.out.println("Vehicle Constructor");
//	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public final void print() {
		System.out.println("Vehicle Color : " + color);
		System.out.println("Vehicle Speed : " + maxSpeed);
	}
}
