package com.day10.abstraction;

// Abstract class
abstract class Figure {
	// Abstract method
	abstract void calcArea(double length);
}
// child class inherit abstract class
class FigureImpl extends Figure {

	@Override
	void calcArea(double length) {
		// TODO Auto-generated method stub

		double rectArea = length * length; // provide functionality 
		System.out.println("Area of rectangle: " + rectArea);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Figure fg = new Figure(); // Error abstract class cannot be instantiated
		
		FigureImpl f = new FigureImpl();
		f.calcArea(100);
		

	}

}