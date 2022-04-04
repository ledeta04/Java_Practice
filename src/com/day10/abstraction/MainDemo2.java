package com.day10.abstraction;

abstract class Figure1{ 

	double dim1, dim2;

	Figure1(double a, double b) {  // constructed
		dim1 = a;
		dim2 = b;
	}

	abstract void area();
}

class Rectangle extends Figure1 {

	Rectangle(double a, double b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	@Override
	void area() {
		// TODO Auto-generated method stub
		double result = dim1 * dim2;
		System.out.println("Area of Rectangle: " + result);
	}
}

public class MainDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle r = new Rectangle(10, 20);
		r.area();
		
	}

}
