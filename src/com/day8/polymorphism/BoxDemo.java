package com.day8.polymorphism;

public class BoxDemo {
	
	// Overloading Constructor
	
	double width;
	double height;
	double depth;
	
	BoxDemo(){       // Constructor name has to be same with Class
		width = 5;
		height = 10;
		depth = 3;
	}
	BoxDemo(double w, double h, double d){
		
		width = w;
		height = h;
		depth = d;
	}
	double volume() {
		return width * height * depth;
	}
	

}
