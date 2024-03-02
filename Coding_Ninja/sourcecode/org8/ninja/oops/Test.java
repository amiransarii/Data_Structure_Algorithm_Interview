package org8.ninja.oops;
class Vehicle{
    void print(){
    System.out.print("Vehicle class");
    }
}
class Car extends Vehicle{
    void print(){
    System.out.print("Car class ");
    }
}



public class Test {
	public static void main(String[] args){   
	    Vehicle obj1 = new Car();
	    obj1.print();

	    Vehicle obj2 = new Vehicle();
	    obj2.print();  
	    }
}
