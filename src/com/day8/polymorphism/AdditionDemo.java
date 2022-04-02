package com.day8.polymorphism;

public class AdditionDemo {
	
	// Method Overload or compile time polymorphism 
	
	int add(int a) {
		
		return a+a;
	}
	int add(int a, int b) {
		
		return a+b;
	}
	int add(int a, int b, int c) {
		
		return a+b+c;
	}
	double add(double a) {
		
		return a+a;
	}
	double add(double a, double b) {
		
		return a+b;
	}
	double add(double a, int b, double c) {
		
		return a+b+c;
	}
	

}
