package org.nininja.utils;

public class ComplexNumbers2 {
	int real;
	int imaginary;

	ComplexNumbers2(int real, int imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	void plus(ComplexNumbers2 c) {
		int real = this.real + c.real;
		int imaginary = this.imaginary + c.imaginary;
		this.real = real;
		this.imaginary = imaginary;
	}

	void multiply(ComplexNumbers2 c) {
		int real = (this.real * c.real) - (this.imaginary * c.imaginary);
		int imaginary = (this.real * c.imaginary) + (this.imaginary * c.real);
		this.real = real;
		this.imaginary = imaginary;
	}

	void print() {
		System.out.println(this.real + " + i" + this.imaginary);
	}

}
