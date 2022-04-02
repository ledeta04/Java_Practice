package com.day8.polymorphism;

public class ShapeMainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ShapeDemo m1 = new ShapeDemo();
		
		System.out.println("rectArea " + m1.calcArea(10, 10)); //Method Overloading
		System.out.println("circleArea " + m1.calcArea(10));  //Method Overloading
		System.out.println("triArea " + m1.calcArea(20, 20, 20)); //Method Overloading

	}

}
